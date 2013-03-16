package br.com.globalcode.aw.business.command.online;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuscarPedidosCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
      request.setAttribute("destino","/lojaOnline/pedido/formBusca.jsp");
      request.setAttribute("tipoNavegacao","forward");
    }
    
}
