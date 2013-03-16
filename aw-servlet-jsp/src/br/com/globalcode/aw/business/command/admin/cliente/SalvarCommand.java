package br.com.globalcode.aw.business.command.admin.cliente;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SalvarCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        //Leitura de parâmetros do request para criacao de um objeto cliente a ser salvo
        //Leitura e inicializacao do id
        String idCliente = request.getParameter("idCliente");
        Integer id ;
        try{
            id = new Integer(idCliente);
        } catch(NumberFormatException e) {
            id = null;
        }
        
        //Leitura de parametros String
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String enderecoRua = request.getParameter("enderecoRua");
        String enderecoNumero = request.getParameter("enderecoNumero");
        String enderecoBairro = request.getParameter("enderecoBairro");
        String enderecoCep = request.getParameter("enderecoCep");
        String enderecoCidade = request.getParameter("enderecoCidade");
        String enderecoEstado = request.getParameter("enderecoEstado");
        String senha = email; // temporariamente ficará assim
        
        //Leitura e inicializacao do status
        String status = request.getParameter("status");
        boolean ativo = "Ativo".equals(status);
        
        //Criacao da instância
        Cliente cliente = new Cliente(id,nome,email,senha,telefone,ativo,
                enderecoRua,enderecoNumero,enderecoBairro,enderecoCep,
                enderecoCidade,enderecoEstado);
        
        //Utiliza-se o DAO para inserir/atualizar a cliente no BD
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ClienteDAO dao = factory.getClienteDAO();
            dao.save(cliente);
        } catch (Exception ex) {
            throw new WebCommandException("[cliente.SalvarCommand]" + ex.getMessage(),ex);
        }
        
        //Apos a insercao/atualizacao faz-se a listagem dos clientes
        new ListarCommand().doAction(request,response);
    }
}
