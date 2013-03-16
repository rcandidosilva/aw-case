package br.com.globalcode.aw.business.command.online;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CatalogoProdutosCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
        
        List produtos = new ArrayList();
        
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            produtos = dao.getAll();
        } catch (Exception ex) {
            throw new WebCommandException("[produto.ListarCommand]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("produtos",produtos);
        
        request.setAttribute("destino","/lojaOnline/compra/formCatalogoProdutos.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
    
}
