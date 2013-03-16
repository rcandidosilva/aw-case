package br.com.globalcode.model;

import java.util.Date;

public class ResumoPedido {
    private long numero;
    private Date data;
    private double total;

    public ResumoPedido(long numero, Date data, double total) {
	this.numero = numero;
	this.data = data;
	this.total = total;
    }

    public Date getData() {
	return data;
    }

    public long getNumero() {
	return numero;
    }

    public double getTotal() {
	return total;
    }
}
