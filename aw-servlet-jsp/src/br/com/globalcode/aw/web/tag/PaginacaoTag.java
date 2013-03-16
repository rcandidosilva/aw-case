package br.com.globalcode.aw.web.tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;

public class PaginacaoTag extends SimpleTagSupport {
    
    private Collection lista;
    private int inicio;
    private int tamanho;
    
    public void doTag() throws JspException {
        
        JspWriter out=getJspContext().getOut();
        String contexto = (String) getJspContext().findAttribute("contexto");
        if(contexto == null) {
            throw new JspException("Deve ser criado um contexto para os links de paginacao");
        }
        
        //Cria uma lista somente com os elementos a serem exibidos.
        //Caso a Collection lista seja um java.util.List extrai a sublista.
        List listaPaginada;
        int termino = Math.min(inicio+tamanho,lista.size());        
        if(lista instanceof List) {
            listaPaginada = ((List)lista).subList(inicio,termino);
        }
        //Caso contrario faz uma conversão para array para extrair uma sublista
        else {
            Object[] listaTemporaria = lista.toArray();
            listaPaginada = new ArrayList();
            for (int i = inicio; i < termino; i++) {
                listaPaginada.add(listaTemporaria[i]);
            }
        }
        
        getJspContext().setAttribute("listaPaginada",listaPaginada);
        try {
            //Calcula o numero de paginas de acordo com o tamanho da pagina e da lista de elementos
            int tamanhoLista = lista.size();
            int numPaginas = tamanhoLista%tamanho == 0 ? tamanhoLista/tamanho :tamanhoLista/tamanho +1;
            
            //Executa o corpo do tag
            JspFragment f=getJspBody();
            if (f != null) f.invoke(out);
            
            //Coloca os indices das paginas quando houver mais de uma
            if(numPaginas > 1) {
                out.println("<table width='100%'>");
                out.println("<tr>");
                out.println("<td class='GC_Normal'>P&aacute;gina "+(inicio/tamanho+1)+" de "+numPaginas+"</td>");
                out.println("</tr>");                
                out.println("<td class='texto_rodape_tabelas'>&lt;&lt;");
                for(int i = 0; i < numPaginas ;i++) {
                    out.println("<a href='"+contexto+"/controller?command=online.CatalogoProdutos&inicioPagina="+(i*tamanho)+"'>"+(i+1)+"</a>");
                }
                out.println("&gt;&gt; </td></tr>");
                out.println("</table>");
            }
        } catch (java.io.IOException ex) {
            throw new JspException(ex.getMessage());
        }
        
    }
    
    public void setLista(Collection lista) {
        this.lista = lista;
    }
    
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
