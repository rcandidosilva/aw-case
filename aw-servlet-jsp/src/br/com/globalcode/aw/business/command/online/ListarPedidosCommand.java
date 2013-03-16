package br.com.globalcode.aw.business.command.online;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.PedidoDAO;
import br.com.globalcode.model.Cliente;
import br.com.globalcode.util.FormatHelper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarPedidosCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        List pedidos = new ArrayList();
        String idCliente = request.getParameter("idCliente");
        String dataInicio = request.getParameter("dataInicio");
        String dataFinal = request.getParameter("dataFinal");
        
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            PedidoDAO dao = factory.getPedidoDAO();
            //Verifica o tipo de busca a ser feita
            if (idCliente!=null && !idCliente.equals("")) {
                Integer id = new Integer(idCliente);
                Cliente cliente = (Cliente) request.getSession().getAttribute("usuario");
                
                //Verificamos se a busca deve ser dos pedidos do proprio usuario ou de
                //algum outro cliente.
                if(!id.equals(cliente.getId())) {
                    ClienteDAO clienteDao = factory.getClienteDAO();
                    cliente = clienteDao.getByPrimaryKey(id);
                }
                Debug.log("Realizando busca de pedidos por cliente",9);                
                pedidos = dao.getByCliente(cliente);
            } else if ((dataInicio != null && !dataInicio.equals("")) || (dataFinal != null && !dataFinal.equals(""))) {
                Debug.log("Realizando busca de pedidos por periodo",9);
                pedidos = dao.getByPeriodo(dataInicio,dataFinal);
            } else {
                Debug.log("Realizando busca de todos os pedidos",9);
                pedidos = dao.getAll();
            }
        } catch (Exception ex) {
            throw new WebCommandException("[online.ListarPedidosCommand]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("pedidos",pedidos);
        
        request.setAttribute("destino","/lojaOnline/pedido/formPedidos.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
}
