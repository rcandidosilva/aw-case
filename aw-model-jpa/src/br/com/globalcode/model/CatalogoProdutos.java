package br.com.globalcode.model;

import java.io.Serializable;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Sort;
import org.hibernate.annotations.SortType;

import br.com.globalcode.comparator.ComparatorProdutoCategoriaNome;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "catalogos")
public class CatalogoProdutos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date validade;
    @ManyToMany
    @JoinTable(name = "catalogos_produtos", joinColumns = { @JoinColumn(name = "id_catalogo", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "id_produto", referencedColumnName = "id") })
    @Sort(type = SortType.COMPARATOR, comparator = ComparatorProdutoCategoriaNome.class)
    @Cascade(value = { CascadeType.SAVE_UPDATE })
    private SortedSet<Produto> produtos = new TreeSet<Produto>(
	    new ComparatorProdutoCategoriaNome());

    public CatalogoProdutos() {
	super();
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

    public Date getValidade() {
	return validade;
    }

    public void setValidade(Date validade) {
	this.validade = validade;
    }

    public SortedSet<Produto> getProdutos() {
	return produtos;
    }

    public void setProdutos(SortedSet<Produto> produtos) {
	this.produtos = produtos;
    }

    @Override
    public String toString() {
	return this.nome;
    }

    @Override
    public boolean equals(Object o) {
	if (o == null)
	    return false;
	if (this == o)
	    return true;
	boolean result = false;
	if (o instanceof Categoria) {
	    CatalogoProdutos outro = (CatalogoProdutos) o;
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