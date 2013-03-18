package br.com.globalcode.backing_bean.online;

import br.com.globalcode.dao.*;
import br.com.globalcode.model.*;
import br.com.globalcode.comparator.ComparatorPedidoClienteNumero;
import br.com.globalcode.util.FormatHelper;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;

import javax.servlet.http.HttpSession;

@ManagedBean(name="PedidoMB")
@SessionScoped
public class PedidosMB {
    
    private Date dataInicio;
    private Date dataFinal;
    private Cliente cliente;
    private ListDataModel pedidos;
    private Pedido pedidoSelecionado;
    private boolean boleto = false;
    
    public PedidosMB() {
    }
    
    public void setPedidos(ListDataModel pedidos) {
        this.pedidos = pedidos;
    }
    
    public ListDataModel getPedidos() {
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            PedidoDAO dao = factory.getPedidoDAO();
            List pedidosList = null;
            if (dataInicio != null || dataFinal != null) {
                String strDataInicio = FormatHelper.getInstance().simpleDateFormat(dataInicio);
                String strDataFinal = FormatHelper.getInstance().simpleDateFormat(dataFinal);
                pedidosList = dao.getByPeriodo(strDataInicio, strDataFinal);
            } else if(cliente != null){
                pedidosList = dao.getByCliente(cliente);
            } else {
                pedidosList = dao.getAll();
            }
            if(pedidosList != null && pedidosList.size()>0)
                Collections.sort(pedidosList,new ComparatorPedidoClienteNumero());
            pedidos = new  ListDataModel(pedidosList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pedidos;
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
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setBoleto(boolean boleto) {
        this.boleto = boleto;
    }
    
    public boolean isBoleto() {
        return boleto;
    }
    
    public void setPedidoSelecionado(Pedido pedidoSelecionado) {
        this.pedidoSelecionado = pedidoSelecionado;
    }
    
    public Pedido getPedidoSelecionado() {
        if (pedidoSelecionado.getPagamento() instanceof PagamentoBoleto) {
            this.setBoleto(true);
        } else {
            this.setBoleto(false);
        }
        return pedidoSelecionado;
    }
    
    public String buscarPedidos() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formPedidos.jsp");
        cliente = null;
        pedidos = this.getPedidos();
        return null;
        //return "pedidos";
    }
    
    public String buscarMeusPedidos() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formPedidos.jsp");
        cliente = (Cliente)session.getAttribute("usuario");
        dataInicio = null;
        dataFinal = null;
        pedidos = this.getPedidos();
        return null;
        //return "pedidos";
    }
    
    public String buscarTodosPedidos() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formPedidos.jsp");
        cliente = null;
        dataInicio = null;
        dataFinal = null;
        pedidos = this.getPedidos();
        return null;
        //return "pedidos";
    }
    
    public String verDetalhes() {
        pedidoSelecionado = (Pedido)pedidos.getRowData();
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "dadosPedido.jsp");
        return null;
        //return "editaPedido";
    }
    
}
