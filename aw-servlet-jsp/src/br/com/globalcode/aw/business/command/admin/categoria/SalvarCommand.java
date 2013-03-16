package br.com.globalcode.aw.business.command.admin.categoria;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Categoria;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SalvarCommand implements WebCommand {
    
    public void doAction(
            HttpServletRequest request,
            HttpServletResponse response)
            throws WebCommandException {
        
        //Leitura de parâmetros do request para criacao de um objeto Categoria a ser salvo
        //Leitura e inicializacao do id
        String idCategoria = request.getParameter("idCategoria");
        Integer id = null;
        try{
            id = new Integer(idCategoria);
        } catch(NumberFormatException e) {
            id = null;
        }
        
        //Leitura da descricao
        String descricao = request.getParameter("descricao");
        
        //Leitura e inicializacao do status
        String status = request.getParameter("status");
        boolean ativo = "Ativo".equals(status);
        
        //Criacao da instância
        Categoria categoria = new Categoria(id,descricao,ativo);
        
        //Utiliza-se o DAO para inserir/atualizar a categoria no BD
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            dao.save(categoria);
        } catch (Exception ex) {
            throw new WebCommandException("[categoria.SalvarCommand]" + ex.getMessage(),ex);
        }
        
        //Apos a insercao/atualizacao faz-se a listagem das categorias
        new ListarCommand().doAction(request,response);
    }
}
