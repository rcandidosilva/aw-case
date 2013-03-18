package br.com.globalcode.backing_bean.backoffice;

//import br.com.globalcode.aw.util.GeradorDeRelatorio;
import br.com.globalcode.comparator.ComparatorProdutoCategoriaNome;
import br.com.globalcode.dao.ProdutoDAO;
import br.com.globalcode.dao.jdbc.JDBCFactory;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="RelatorioProdutosMB")
@RequestScoped
public class RelatorioProdutosMB{

    public RelatorioProdutosMB(){
    }

    public String gerar() {
        
        // nome do arquivo compilado .jasper
        String arquivo = "RelatorioProdutos.jasper";
        
        // parâmetros, se houverem
        Map parametros = new HashMap();

        // dados para o datasource
        List produtos = new ArrayList();
        try {
            JDBCFactory factory = new JDBCFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            produtos = dao.getAll();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // ordena os dados por categoria
        Collections.sort(produtos, new ComparatorProdutoCategoriaNome());
        
        //GeradorDeRelatorio.execute(arquivo, parametros, produtos);
        
        return null;

    }
    
}
