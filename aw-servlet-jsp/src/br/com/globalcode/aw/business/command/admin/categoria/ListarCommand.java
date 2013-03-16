package br.com.globalcode.aw.business.command.admin.categoria;

import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.exception.GlobalcodeException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.dao.CategoriaDAO;
import java.util.ArrayList;
import java.util.List;

public class ListarCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        List categorias = new ArrayList();
        
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            categorias = dao.getAll();
        } catch (Exception ex) {
            throw new WebCommandException("[categoria.ListarCommand]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("categorias",categorias);
        
        request.setAttribute("destino","/admin/categoria/formLista.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
}
