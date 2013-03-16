package br.com.globalcode.aw.business.command.backoffice.relatorio;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutosCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
      request.setAttribute("destino","/lojaBackOffice/relatorio/formRelatorioProdutos.jsp");
      request.setAttribute("tipoNavegacao","forward");
    }
    
}

