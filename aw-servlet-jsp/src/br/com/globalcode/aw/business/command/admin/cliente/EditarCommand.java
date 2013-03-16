package br.com.globalcode.aw.business.command.admin.cliente;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditarCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
        
        String id = request.getParameter("idCliente");
        Cliente cliente = null;
        if(id != null && !id.equals("")) {
            try {
                DAOFactory factory = BaseDAOFactory.getFactory();
                ClienteDAO dao = factory.getClienteDAO();
                cliente = dao.getByPrimaryKey(new Integer(id));
            } catch (Exception ex) {
                throw new WebCommandException("[cliente.EditarCommand]" + ex.getMessage(),ex);
            }
        } else {
            cliente = new Cliente();
        }
        
        request.setAttribute("cliente",cliente);
        
        
        request.setAttribute("destino","/admin/cliente/formDados.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
    
}
