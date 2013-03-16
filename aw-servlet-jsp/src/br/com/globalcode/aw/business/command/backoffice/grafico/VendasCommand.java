package br.com.globalcode.aw.business.command.backoffice.grafico;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VendasCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
      request.setAttribute("destino","/lojaBackOffice/grafico/formGraficoVendas.jsp");
      request.setAttribute("tipoNavegacao","forward");
    }
    
}
