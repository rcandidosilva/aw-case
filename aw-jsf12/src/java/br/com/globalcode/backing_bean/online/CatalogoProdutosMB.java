package br.com.globalcode.backing_bean.online;

import br.com.globalcode.dao.*;
import br.com.globalcode.dao.jdbc.JDBCFactory;
import br.com.globalcode.model.*;

import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

public class CatalogoProdutosMB {
    
    public static String CARTAO_CREDITO = "cartao";
    public static String BOLETO = "boleto";
    
    private ListDataModel produtos;
    private CarrinhoCompras carrinho;
    private String formaPagamentoSelecionada = "cartao";
    private List bancos;
    private List bandeiras;
    private Cliente cliente;
    private boolean boleto = false;
    private List formasPagamento;
    private Pagamento pagamento = new PagamentoCartaoCredito();
    
    public CatalogoProdutosMB() {
        pagamento = new PagamentoCartaoCredito();
        HttpSession session = 
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        cliente = (Cliente)session.getAttribute("usuario"); 
    }
    
    public void setProdutos(ListDataModel produtos) {
        this.produtos = produtos;
    }
    
    public ListDataModel getProdutos() {
        List produtos = new ArrayList();
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            produtos = dao.getAll();
            this.produtos = new ListDataModel(produtos);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.produtos;
    }
    
    public void setCarrinho(CarrinhoCompras carrinho) {
        this.carrinho = carrinho;
    }
    
    public CarrinhoCompras getCarrinho() {
        return carrinho;
    }
    
    public void setFormaPagamentoSelecionada(String formaPagamento) {
        this.formaPagamentoSelecionada = formaPagamento;
        if (BOLETO.equals(formaPagamento))
            boleto = true;
        else
            boleto = false;
    }
    
    public void setBancos(List bancos) {
        this.bancos = bancos;
    }
    
    public List getBancos() {
        List listBancos = null;
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            BancoDAO dao = factory.getBancoDAO();
            listBancos = dao.getAll();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        List bancos = new ArrayList();
        if(listBancos != null && listBancos.size()>0){
            for (Iterator it = listBancos.iterator(); it.hasNext();) {
                Banco banco = (Banco) it.next();
                bancos.add(new SelectItem(banco, banco.getNome()));
            }
        }
        return bancos;
    }
    
    public void setBoleto(boolean boleto) {
        this.boleto = boleto;
    }
    
    public boolean isBoleto() {
        return boleto;
    }
    
    public void setFormasPagamento(List formasPagamento) {
        this.formasPagamento = formasPagamento;
    }
    
    public List getFormasPagamento() {
        formasPagamento = new ArrayList();
        formasPagamento.add(new SelectItem(BOLETO, BOLETO));
        formasPagamento.add(new SelectItem(CARTAO_CREDITO, CARTAO_CREDITO));
        return formasPagamento;
    }
    
    public String getFormaPagamentoSelecionada() {
        return formaPagamentoSelecionada;
    }
    
    public void formaPagamentoSelecionada(ValueChangeEvent valueChangeEvent) {
        System.out.println("Forma pagamento selecionada");
    }
    
    public void setBandeiras(List bandeiras) {
        this.bandeiras = bandeiras;
    }
    
    public List getBandeiras() {
        List listBandeiras = null;
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            BandeiraCartaoCreditoDAO dao = factory.getBandeiraCartaoCreditoDAO();
            listBandeiras = dao.getAll();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        List bandeiras = new ArrayList();
        if(listBandeiras != null && listBandeiras.size()>0){
            for (Iterator it = listBandeiras.iterator(); it.hasNext();) {
                BandeiraCartaoCredito bandeira = (BandeiraCartaoCredito) it.next();
                bandeiras.add(new SelectItem(bandeira, bandeira.getNome()));
            }
        }
        return bandeiras;
    }
    
    public Pagamento getPagamento() {
        return pagamento;
    }
    
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void valueChangeListener(ValueChangeEvent valueChangeEvent) {
        System.out.println("[ValueChangeListener] - pagamento=" + pagamento);
        if (valueChangeEvent.getNewValue().equals("boleto")) {
            this.setBoleto(true);
            pagamento = new PagamentoBoleto(pagamento);
        } else {
            this.setBoleto(false);
            pagamento = new PagamentoCartaoCredito(pagamento);
        }
        this.finalizarPedido();
        FacesContext.getCurrentInstance().renderResponse();
    }
    
    public String finalizarPedido() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formFinalizarPedido.jsp");
        return null;
    }
    
    public String viewAll() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formCatalogoProdutos.jsp");
        return null;
    }
    
    public String buscarPedidos() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formBuscaPedidos.jsp");
        return null;
    }
    
    public String adicionarCarrinho() {
        System.out.println("Adicionar produto no carrinho");
        Produto produtoSelecionado = (Produto)this.produtos.getRowData();
        System.out.println("Produto selecionado pelo cliente " + produtoSelecionado);
        ItemCompra item = new ItemCompra(produtoSelecionado, 1, 0);
        //caso não exista um carrinho, cria-se um e adiciona-se o item desejado
        if (carrinho == null) {
            carrinho = new CarrinhoCompras(item);
        } else {
            carrinho.addItem(item);
        }
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "formCarrinhoCompras.jsp");
        return null;
        //return "carrinhoCompras";
    }
    
    public String enviarPedido() {
        System.out.println("[CatalogoProdutosMB - enviarPedido]" + pagamento);
        JDBCFactory factory = new JDBCFactory();
        try {
            ClienteDAO clienteDao = factory.getClienteDAO();
            cliente = clienteDao.save(cliente);
        } catch (Exception ex) {
            ex.printStackTrace();
            FacesContext.getCurrentInstance().addMessage("mensagemDeErro", new FacesMessage("Erro ao salvar os dados do cliente no envio do pedido"));
        }
        try {
            pagamento.setDataPagamento(new Date());
            pagamento.setValor(carrinho.getPrecoTotal());
            if (pagamento instanceof PagamentoCartaoCredito) {
                ((PagamentoCartaoCredito)pagamento).setBandeiraCartaoCredito(new BandeiraCartaoCredito(new Integer(1),"Visa"));
            } else if (pagamento instanceof PagamentoBoleto) {
                ((PagamentoBoleto)pagamento).setBanco(new Banco(new Integer(1),"Banco do Brasil"));
            }
            
            PagamentoDAO pagamentoDao = factory.getPagamentoDAO();
            pagamento = pagamentoDao.save(pagamento);
            
            //Criacao do pedido
            String clienteBrowser = "";
            String clienteIP = "";
            String status = "";
            
            Pedido pedido =
                new Pedido(cliente, clienteBrowser, clienteIP, new Date(),
                carrinho.getItens(), pagamento, status);
            System.out.println("[CatalogoProdutosManagedBean ] Enviando pedido para o banco de dados " +
                pedido);
            PedidoDAO dao = factory.getPedidoDAO();
            dao.save(pedido);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            FacesContext.getCurrentInstance().addMessage("mensagemDeErro", new FacesMessage("Erro ao salvar os dados do pedido no envio do pedido"));
        }
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage", "pedidoEnviado.jsp");
        return null;
        //return "pedidoEnviado";
    }
}

