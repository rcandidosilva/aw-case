package br.com.globalcode.model;

import java.io.Serializable;
import java.util.Date;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_compra")
    private Date dataCompra;
    @Column(name = "cliente_IP")
    private String clienteIP;
    @Column(name = "cliente_browser")
    private String clienteBrowser;
    private String status;
    @OneToMany
    @JoinColumn(name = "numero_pedido")
    @Cascade(value = {CascadeType.ALL, CascadeType.DELETE_ORPHAN})
    private List<ItemCompra> itensPedido;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_pagamento")
    @Cascade(CascadeType.DELETE)
    @Fetch(FetchMode.JOIN)
    public Pagamento pagamento;

    public Pedido() {
    }

    public Pedido(Cliente cliente, String clienteBrowser, String clienteIP,
            Date dataCompra, List itensPedido, Pagamento pagamento, String status) {
        this.cliente = cliente;
        this.clienteBrowser = clienteBrowser;
        this.clienteIP = clienteIP;
        this.dataCompra = dataCompra;
        this.itensPedido = itensPedido;
        this.pagamento = pagamento;
        this.status = status;
    }

    public Pedido(Long numero, Cliente cliente, String clienteBrowser,
            String clienteIP, Date dataCompra, List itensPedido, Pagamento pagamento,
            String status) {
        this(cliente, clienteBrowser, clienteIP, dataCompra, itensPedido, pagamento,
                status);
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date data) {
        this.dataCompra = data;
    }

    public String getClienteIP() {
        return clienteIP;
    }

    public void setClienteIP(String clienteIP) {
        this.clienteIP = clienteIP;
    }

    public String getClienteBrowser() {
        return clienteBrowser;
    }

    public void setClienteBrowser(String clienteBrowser) {
        this.clienteBrowser = clienteBrowser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ItemCompra> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemCompra> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return getNumero() != null ? getNumero().toString() : null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        boolean result = false;
        if (o instanceof Pedido) {
            Pedido outro = (Pedido) o;
            result = this.getCliente() != null && this.getDataCompra() != null && this.getCliente().equals(outro.getCliente()) && this.getDataCompra().equals(outro.getDataCompra());
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = getCliente() != null ? getCliente().hashCode() : 41;
        result = (getDataCompra() != null ? getDataCompra().hashCode() : 37) + 23 * result;
        return result;
    }
}
