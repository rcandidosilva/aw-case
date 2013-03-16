package br.com.globalcode.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.globalcode.dao.DAOException;
import br.com.globalcode.dao.ProdutoDAO;
import br.com.globalcode.model.Categoria;
import br.com.globalcode.model.Produto;

public class ProdutoHibernate implements ProdutoDAO {
    public void delete(Produto produto) throws DAOException {
	HibernateHelper.getManagedSession().delete(produto);
    }

    public List getAll() throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Produto.class);
	criteria.addOrder(Order.asc("nome"));
	return criteria.list();
    }

    public List getByCategoria(Categoria categoria) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Produto.class);
	criteria.add(Restrictions.eq("categoria", categoria));
	criteria.addOrder(Order.asc("nome"));
	return criteria.list();
    }

    public List getByMarca(String marca) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Produto.class);
	criteria.add(Restrictions.ilike("marca", marca, MatchMode.ANYWHERE));
	criteria.addOrder(Order.asc("nome"));
	return criteria.list();
    }

    public Produto getByPrimaryKey(Integer id) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	return (Produto) session.get(Produto.class, id);
    }

    public List getProdutos(String nome, Integer idCategoria, String marca)
	    throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Produto.class);
	if (nome != null && nome.trim().length() > 0) {
	    criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
	}
	if (idCategoria != null) {
	    criteria.createAlias("categoria", "cat");
	    criteria.add(Restrictions.eq("cat.id", idCategoria));
	}
	if (marca != null && marca.trim().length() > 0) {
	    criteria
		    .add(Restrictions.ilike("marca", marca, MatchMode.ANYWHERE));
	}
	criteria.addOrder(Order.asc("nome"));
	return criteria.list();
    }

    public void save(Produto produto) throws DAOException {
	HibernateHelper.getManagedSession().saveOrUpdate(produto);
    }
}
