package br.com.globalcode.aw.web.tag;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Categoria;
import java.util.List;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;

public class ComboCategorias extends SimpleTagSupport {
    
    /**
     * Initialization of codigo property.
     */
    private Integer codigo;
    
    /**
     * Initialization of nome property.
     */
    private String nome = "categoria";
    
    /**
     * Initialization of cssClass property.
     */
    private String cssClass = "categoria";
    
    public void doTag() throws JspException {
        
        JspWriter out=getJspContext().getOut();
        List categorias = null;
        
        try {
            //Utiliza o dao para fazer a leitura de categorias
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            categorias = dao.getAll();
            
            //Monta uma caixa combo com as categorias lidas
            Debug.log("Montando caixa combo", 9);
            out.write("<select name='" + nome + "' id='"+ cssClass + "'>");
            out.write("<option value=''></option>");
            boolean sel = false;
            for(int i=0;i<categorias.size();i++) {
                Categoria categoria = (Categoria) categorias.get(i);
                sel=(codigo!=null && categoria.getId().equals(codigo));
                out.write("<option value='" + categoria.getId() + "'" +
                        (sel ? " selected " : "") +
                        ">" + categoria.getDescricao() + "</option>");
            }
            out.write("</select>");
            
        } catch (Exception ex) {
            Debug.log(ex.getMessage(),9);
            throw new JspException(ex.getMessage());
        }
        
    }
    
    /**
     * Setter for the valor attribute.
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Setter for the nome attribute.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Setter for the cssClass attribute.
     */
    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
}
