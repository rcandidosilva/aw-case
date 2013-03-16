package br.com.globalcode.aw.business.command.online;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.PedidoDAO;
import br.com.globalcode.model.Pedido;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerPedidoCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {

        //Leitura do numero do pedido a ser lido
        String idPedido = request.getParameter("idPedido");
        Pedido pedido = null;
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            PedidoDAO dao = factory.getPedidoDAO();
            pedido = dao.getByPrimaryKey(new Integer(idPedido));
            

        } catch (Exception ex) {
            throw new WebCommandException("[online.VerPedidoCommand]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("pedido",pedido);
        
        request.setAttribute("destino","/lojaOnline/pedido/dadosPedido.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
}

