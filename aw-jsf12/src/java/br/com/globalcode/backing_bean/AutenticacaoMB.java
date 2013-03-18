package br.com.globalcode.backing_bean;

import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Cliente;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

public class AutenticacaoMB {

    private String usuario;
    private String senha;
    private boolean lembrarSenha;
    private String msg = "sem usuario";

    /** Creates a new instance of AutenticacaoManagedBean */
    public AutenticacaoMB() {
    }

    public void setUsuario(String usuario) {

        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setLembrarSenha(boolean lembrarSenha) {
        this.lembrarSenha = lembrarSenha;
    }

    public boolean getLembrarSenha() {
        return lembrarSenha;
    }

    public boolean isLembrarSenha() {
        return lembrarSenha;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public String validarUsuario() {
        System.out.println("[AutenticacaoMB] validarUsuario");

        String urlDestino = "login.jsp";
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);

        if ((usuario == null) || (usuario.equals(""))) {
            msg = "Por favor, digite o usuario.";

        } else if ((senha == null) || (senha.equals(""))) {
            msg = "Por favor, digite a senha.";

        } else {
            //if (lembrarSenha != null && lembrarSenha.equals("true")) {
            //    lembrarSenha( usuario, senha);
            //}
            Cliente cliente = null;
            try {
                DAOFactory factory = BaseDAOFactory.getFactory();
                ClienteDAO dao = factory.getClienteDAO();
                cliente = (Cliente)dao.getByEmail(usuario);
                System.out.println("[validarUsuario] usuario :" + cliente);
            } catch (Exception ex) {
                System.out.println("[validarUsuario] exception.printStackTrace() cliente= " + 
                                   cliente);
                ex.printStackTrace();
                FacesContext.getCurrentInstance().addMessage(null, 
                                                             new FacesMessage("Erro na conexao com BD para autenticacao do usuario " + 
                                                                              ex.getMessage()));
                return null;
            }
            if (cliente != null && cliente.getSenha().equals(senha)) {
                session.setAttribute("usuario", cliente);
                msg = "Usuario autenticado.";
                urlDestino = "";
            } else {
                msg = "Usuario e senha invalidos!";
            }

        }
        session.setAttribute("nextPage", urlDestino);
        return null;
    }

    public String cadastrarNovoUsuario() {
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formDados.jsp");
        return null;
    }


}
