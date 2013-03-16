package br.com.globalcode.aw.business.command.admin.produto;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.ProdutoDAO;
import br.com.globalcode.model.Categoria;
import br.com.globalcode.model.Produto;
import br.com.globalcode.model.ProdutoDigital;
import br.com.globalcode.model.ProdutoMaterial;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditarCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
        
        String id = request.getParameter("idProduto");
        Produto produto = null;
        if(id != null && !id.equals("")) {
            try {
                DAOFactory factory = BaseDAOFactory.getFactory();
                ProdutoDAO dao = factory.getProdutoDAO();
                produto = dao.getByPrimaryKey(new Integer(id));
            } catch (Exception ex) {
                throw new WebCommandException("[produto.EditarCommand]" + ex.getMessage(),ex);
            }
        } else {
           // produto = new ProdutoMaterial();
        }
        
        String tipoProduto = null;
        if(produto instanceof ProdutoMaterial)
            tipoProduto = "M";
        else if(produto instanceof ProdutoDigital)
            tipoProduto = "D";
        System.out.println("[produto.EditarCommand] tipo do produto = "+tipoProduto);
        
        request.setAttribute("produto",produto);
        request.setAttribute("tipoProduto",tipoProduto);
        
        request.setAttribute("destino","/admin/produto/formEdicao.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
    
}
