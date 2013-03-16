package br.com.globalcode.aw.business.command.admin.cliente;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuscarCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
      request.setAttribute("destino","/admin/cliente/formBusca.jsp");
      request.setAttribute("tipoNavegacao","forward");
    }
    
}
