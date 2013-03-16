package br.com.globalcode.aw.web.tag;

import br.com.globalcode.model.PagamentoBoleto;
import br.com.globalcode.model.PagamentoCartaoCredito;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspException;

public class IdentificadorPagamento extends SimpleTagSupport {

    private br.com.globalcode.model.Pagamento pagamento;
    
    public void doTag() throws JspException {
    
     if(pagamento instanceof PagamentoBoleto) {
        getJspContext().setAttribute("tipoPagamento","boleto");
        getJspContext().setAttribute("pagamentoBoleto",(PagamentoBoleto)pagamento);        
     }
     else {
         getJspContext().setAttribute("tipoPagamento","cart&atilde;o");
         getJspContext().setAttribute("pagamentoCartao",(PagamentoCartaoCredito)pagamento);                 
     }
        
    }

    public void setPagamento(br.com.globalcode.model.Pagamento value) {
        this.pagamento = value;
    }
}
