package br.com.globalcode.aw.business.command.admin.produto;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.ProdutoDAO;
import br.com.globalcode.model.Categoria;
import br.com.globalcode.model.Produto;
import br.com.globalcode.model.ProdutoDigital;
import br.com.globalcode.model.ProdutoMaterial;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SalvarCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        //Leitura de parâmetros do request para criacao de um objeto Produto a ser salvo
        //Leitura e inicializacao do id
        String idProduto = request.getParameter("idProduto");
        Integer id = null;
        try{
            id = new Integer(idProduto);
        } catch(NumberFormatException e) {
            id = null;
        }
        
        //Leitura do nome e marca
        String nome = request.getParameter("nome");
        String marca = request.getParameter("marca");
        
        //Leitura e inicializacao do status
        String status = request.getParameter("status");
        boolean ativo = "Ativo".equals(status);
        
        //Leitura do preco
        String txtPreco = request.getParameter("preco");
        double preco = 0.0;
        try{
            preco = Double.parseDouble(txtPreco);
        } catch(NumberFormatException e) {
            Debug.log("Valor invalido de preco. Usando default 0",9);
        }
        
        DAOFactory factory = null;

        //Leitura da categoria
        Categoria categoria = null;
        try {
            String txtCategoria = request.getParameter("categoria");
            Integer idCategoria = null;
            try{
                idCategoria = new Integer(txtCategoria);
            } catch(NumberFormatException e) {
                idCategoria = null;
            }
            factory = BaseDAOFactory.getFactory();
            CategoriaDAO categoriaDAO = factory.getCategoriaDAO();
            categoria = categoriaDAO.getByPrimaryKey(idCategoria);
        } catch (Exception ex) {
            Debug.log(ex.getMessage(),9);
            throw new WebCommandException("[produto.SalvarCommand]" + ex.getMessage(),ex);
        }
        
        // tipo de produto
        String tipo = request.getParameter("tipo");
        Produto produto = null;
        
        if(tipo.equals("M")){

            String txtTaxa = request.getParameter("taxaEntrega");
            double taxa = 0.0;
            try{
                taxa = Double.parseDouble(txtTaxa);
            } catch(NumberFormatException e) {
                Debug.log("Valor invalido de taxa. Usando default 0.",9);
            }
            produto = new ProdutoMaterial(id,categoria,marca,nome,preco,ativo,taxa);
            
        }else if(tipo.equals("D")){

            String nomeArquivo = request.getParameter("nomeArquivo");
            String txtTamanho = request.getParameter("tamanho");
            int tamanho = 0;
            try{
                tamanho = Integer.parseInt(txtTamanho);
            } catch(NumberFormatException e) {
                Debug.log("Valor invalido de tamanho. Usando default 0.",9);
            }
            produto = new ProdutoDigital(id,categoria,marca,nome,preco,ativo,nomeArquivo,tamanho);
            
        }
        
        try {
            //Utiliza-se o DAO para inserir/atualizar o produto no BD
            ProdutoDAO produtoDAO = factory.getProdutoDAO();
            produtoDAO.save(produto);
            
        } catch (Exception ex) {
            Debug.log(ex.getMessage(),9);
            throw new WebCommandException("[produto.SalvarCommand]" + ex.getMessage(),ex);
        }
        
        //Apos a insercao/atualizacao faz-se a busca da listagem dos produtos
        new BuscarCommand().doAction(request,response);
    }
}
