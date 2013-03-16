package br.com.globalcode.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pagamentos")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Column(name = "data_pagamento")
    @Temporal(TemporalType.DATE)
    protected Date dataPagamento;
    protected double valor;

    public Pagamento() {
	super();
    }

    public Pagamento(Date dataPagamento, double valor) {
	this.dataPagamento = dataPagamento;
	this.valor = valor;
    }

    public Pagamento(Integer id, Date dataPagamento, double valor) {
	this(dataPagamento, valor);
	this.id = id;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Date getDataPagamento() {
	return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
	this.dataPagamento = dataPagamento;
    }

    public double getValor() {
	return valor;
    }

    public void setValor(double valor) {
	this.valor = valor;
    }

    @Override
    public String toString() {
	return getId() != null ? getId().toString() : null;
    }
}