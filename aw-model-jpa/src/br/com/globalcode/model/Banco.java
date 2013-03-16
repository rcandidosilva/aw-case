package br.com.globalcode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class Banco implements Serializable {
    @Column(name = "id_banco")
    private Integer id;
    @Transient
    private String nome;

    public Banco() {
	super();
    }

    public Banco(Integer id, String nome) {
	this.id = id;
	this.nome = nome;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    @Override
    public String toString() {
	return getNome() + " - " + getId();
    }

    @Override
    public boolean equals(Object o) {
	if (o == null)
	    return false;
	if (this == o)
	    return true;
	boolean result = false;
	if (o instanceof Banco) {
	    Banco outro = (Banco) o;
	    result = this.getNome() != null
		    && this.getNome().equals(outro.getNome());
	}
	return result;
    }

    @Override
    public int hashCode() {
	int result = getNome() != null ? getNome().hashCode() : 41;
	return result;
    }
}