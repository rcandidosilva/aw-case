package br.com.globalcode.aw.business.command.admin.categoria;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Categoria;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditarCommand implements WebCommand{
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
        
        String id = request.getParameter("idCategoria");
        Categoria categoria = null;
        if(id != null && !id.equals("")) {
            try {
                DAOFactory factory = BaseDAOFactory.getFactory();
                CategoriaDAO dao = factory.getCategoriaDAO();
                categoria = dao.getByPrimaryKey(new Integer(id));
            } catch (Exception ex) {
                throw new WebCommandException("[categoria.EditarCommand]" + ex.getMessage(),ex);
            }
        } else {
            categoria = new Categoria();
        }
        
        request.setAttribute("categoria",categoria);
        
        
        request.setAttribute("destino","/admin/categoria/formDados.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
    
    
}
