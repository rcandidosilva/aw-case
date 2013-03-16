package br.com.globalcode.aw.business.command.admin.cliente;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        List clientes = new ArrayList();
        Map parametros = request.getParameterMap();
 
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
         
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ClienteDAO dao = factory.getClienteDAO();
            //Verifica o tipo de busca a ser feita
            if (parametros.containsKey("buscarNome")) {
                Debug.log("Realizando busca de clientes por nome",9);
                clientes = dao.getByNome(request.getParameter("nome"));
            }
            else if(parametros.containsKey("buscarEmail")) {
                Debug.log("Realizando busca de clientes por email",9);                
                Cliente cliente = dao.getByEmail(request.getParameter("email"));
                clientes.add(cliente);
            }
            else {
                Debug.log("Realizando busca de todos os clientes",9);                
                clientes = dao.getAll();
            }
        } catch (Exception ex) {
            throw new WebCommandException("[cliente.ListarCommand]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("clientes",clientes);
        
        request.setAttribute("destino","/admin/cliente/formLista.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
}
