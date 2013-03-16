package br.com.globalcode.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BandeiraCartaoCredito implements java.io.Serializable {
    @Column(name = "id_bandeira_cartao_credito")
    private Integer id;
    @Transient
    private String nome;

    public BandeiraCartaoCredito() {
	super();
    }

    public BandeiraCartaoCredito(Integer id, String nome) {
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
	if (o instanceof BandeiraCartaoCredito) {
	    BandeiraCartaoCredito outro = (BandeiraCartaoCredito) o;
	    result = this.getNome() != null && this.nome.equals(outro.nome);
	}
	return result;
    }

    @Override
    public int hashCode() {
	int result = getNome() != null ? getNome().hashCode() : 41;
	return result;
    }
}