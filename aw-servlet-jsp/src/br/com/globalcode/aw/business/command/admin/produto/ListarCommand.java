package br.com.globalcode.aw.business.command.admin.produto;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        List produtos = new ArrayList();
        
        String nome = request.getParameter("nome");
        String marca = request.getParameter("marca");
        String categoria = request.getParameter("categoria");
        Integer idCategoria = null;
        try{
            idCategoria = new Integer(categoria);
        } catch(NumberFormatException e) {
            idCategoria = null;
        }
        
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            produtos = dao.getProdutos(nome,idCategoria,marca);
        } catch (Exception ex) {
            throw new WebCommandException("[produto.ListarCommand]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("produtos",produtos);
        
        request.setAttribute("destino","/admin/produto/formLista.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
}
