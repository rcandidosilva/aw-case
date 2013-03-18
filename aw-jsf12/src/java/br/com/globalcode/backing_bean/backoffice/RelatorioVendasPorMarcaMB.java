package br.com.globalcode.backing_bean.backoffice;

//import br.com.globalcode.aw.util.GeradorDeRelatorio;
import br.com.globalcode.dao.PedidoDAO;
import br.com.globalcode.dao.jdbc.JDBCFactory;
import br.com.globalcode.dao.jdbc.PedidoJDBC;
import br.com.globalcode.util.FormatHelper;

import java.util.*;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

public class RelatorioVendasPorMarcaMB {
    
    private Date dataInicio;
    private Date dataFinal;
    
    public RelatorioVendasPorMarcaMB() {
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }
    
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    public Date getDataFinal() {
        return dataFinal;
    }
    
    public String buscar() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "buscaRelatorioVendas.jsp");
        return null;
    }
    
    public String gerar() {
        
        // nome do arquivo compilado .jasper
        String arquivo = "RelatorioVendasPorMarca.jasper";
        
        // parâmetros, se houverem
        Map parametros = new HashMap();
        String strDataInicio = FormatHelper.getInstance().simpleDateFormat(dataInicio);
        String strDataFinal = FormatHelper.getInstance().simpleDateFormat(dataFinal);
        parametros.put("dataInicio",strDataInicio);
        parametros.put("dataFinal",strDataFinal);
        
        // dados para o datasource
        List vendas = new ArrayList();
        try {
            JDBCFactory factory = new JDBCFactory();
            PedidoDAO dao = factory.getPedidoDAO();
            vendas = ((PedidoJDBC)dao).getVendasPorMarca(strDataInicio,strDataFinal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //GeradorDeRelatorio.execute(arquivo, parametros, vendas);
        
        return null;
        
    }
    
}
