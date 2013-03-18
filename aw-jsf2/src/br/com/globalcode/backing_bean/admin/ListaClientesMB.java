package br.com.globalcode.backing_bean.admin;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.comparator.ComparatorClienteNome;
import br.com.globalcode.dao.*;
import br.com.globalcode.model.Cliente;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;

import javax.servlet.http.HttpSession;

@ManagedBean(name="ClienteMB")
@SessionScoped
public class ListaClientesMB {
    
    private ListDataModel clientes;
    private Cliente cliente = new Cliente();
    private boolean alteraSenha;
    
    public ListaClientesMB() {
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setClientes(ListDataModel clientes) {
        this.clientes = clientes;
    }
    
    public ListDataModel getClientes() {
        System.out.println("ListaClientes - getClientes");
        Map parametros = new HashMap();//request.getParameterMap();
        String nome = "Aninha";//request.getParameter("nome");
        String email = "";//request.getParameter("email");
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ClienteDAO dao = factory.getClienteDAO();
            List clientesList = null;
            //Verifica o tipo de busca a ser feita
            if (parametros.containsKey("buscarNome")) {
                Debug.log("Realizando busca de clientes por nome", 9);
                clientesList = dao.getByNome(nome);
            } else if (parametros.containsKey("buscarEmail")) {
                Debug.log("Realizando busca de clientes por email", 9);
                Cliente cliente = dao.getByEmail(email);
                clientesList.add(cliente);
            } else {
                Debug.log("Realizando busca de todos os clientes", 9);
                clientesList = dao.getAll();
            }
            Collections.sort(clientesList, new ComparatorClienteNome());
            clientes = new ListDataModel(clientesList);
            return clientes;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public String createNew() {
        System.out.println("ListaClientes - createNew");
        cliente = new Cliente();
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage","editaCliente.jsp");
        //return "editaCliente";
        return null;
    }
    
    public String viewDetail() {
        System.out.println("ListaClientes - viewDetail");
        cliente = (Cliente)clientes.getRowData();
        System.out.println("cliente id="+cliente.getId());
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage","editaCliente.jsp");
        //return "editaCliente";
        return null;
    }
    
    public String viewAll() {
        System.out.println("[ListaClientes] - viewAll");
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "listaClientes.jsp");
        return null;
    }
    
    public String save(){
        
        System.out.println("ListaClientes - save");
        boolean ok = false;
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ClienteDAO dao = factory.getClienteDAO();
            
            // só salva se e-mail não for repetido
            Cliente teste = dao.getByEmail(cliente.getEmail());
            System.out.println("Existe outro cliente com mesmo email? "+teste);
            if(teste == null || cliente.getId().equals(teste.getId())){
                dao.save(cliente);
                System.out.println("Cliente gravado com sucesso.");
                ok = true;
            }else{
                System.out.println("Já existe um cliente cadastrado com este e-mail.");
            }
            
            // atualiza usuário na session
            Cliente usuario = (Cliente)session.getAttribute("usuario");
            if(ok){
                if (usuario == null || usuario.getId().equals(cliente.getId())){
                    session.setAttribute("usuario",cliente);
                    // atualizar o cliente que está em AutenticacaoMB
                    System.out.println("Login ok, atualizando usuario...");
                }
                if (usuario == null){
                    System.out.println("Login ok, indo para a pagina inicial...");
                    session.setAttribute("nextPage","");
                }else{
                    System.out.println("Listando todos os clientes...");
                    session.setAttribute("nextPage","listaClientes.jsp");
                    //return "listaClientes";
                }
            }else{
                System.out.println("Voltando para a edicao deste cliente...");
                session.setAttribute("nextPage","editaCliente.jsp");
                //return "editaCliente";
            }
            
        } catch (Exception e) {
            System.out.println("Ir para a tela de erro...");
            e.printStackTrace();
            session.setAttribute("nextPage","paginaErro.jsp");
            //return "paginaErro";
            
        } finally {
            return null;
        }
        
    }
    
    public void setAlteraSenha(boolean alteraSenha){
        this.alteraSenha = alteraSenha;
    }
    public boolean isAlteraSenha(){
        boolean altera = false;
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        Cliente usuario = (Cliente)session.getAttribute("usuario");
        if(this.cliente == null || this.cliente.getId()==null || 
            (usuario != null && usuario.getId().equals(cliente.getId())))
            altera = true;
        this.setAlteraSenha(altera);
        return alteraSenha;
    }
    
}
