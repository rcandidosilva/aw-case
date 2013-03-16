package br.com.globalcode.aw.business.command.online;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.ProdutoDAO;
import br.com.globalcode.model.CarrinhoCompras;
import br.com.globalcode.model.ItemCompra;
import br.com.globalcode.model.Produto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdicionarItemCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
        
        
        String idProduto = request.getParameter("idProduto");
        Integer id = null;
        try{
            id = new Integer(idProduto);
        } catch(NumberFormatException e) {
            throw new WebCommandException("[adicionarItem] id de produto invalido",e);
        }
        try{
            //Cria um item de compra de acordo com o produto selecionado
            DAOFactory factory = BaseDAOFactory.getFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            Produto produto = dao.getByPrimaryKey(id);
            ItemCompra item = new ItemCompra(produto,1,0);
            
            //Tenta obter uma referencia para o carrinho de compras do usuario
            HttpSession session = request.getSession();
            CarrinhoCompras carrinho = (CarrinhoCompras) session.getAttribute("carrinhoCompras");
            
            //caso não exista um carrinho, cria-se um e adiciona-se o item desejado
            if(carrinho == null) {
                carrinho = new CarrinhoCompras(item);
                session.setAttribute("carrinhoCompras",carrinho);
            }
            else {
                carrinho.addItem(item);
            }
        } catch (Exception ex) {
            throw new WebCommandException("[online.AdicionarItem]" + ex.getMessage(),ex);
        }
        
        request.setAttribute("destino","/lojaOnline/compra/formCarrinhoCompras.jsp");
        request.setAttribute("tipoNavegacao","forward");
    }
    
}
