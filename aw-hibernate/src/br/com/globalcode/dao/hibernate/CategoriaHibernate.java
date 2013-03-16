package br.com.globalcode.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOException;
import br.com.globalcode.model.Categoria;

public class CategoriaHibernate implements CategoriaDAO {
    public void delete(Categoria categoria) throws DAOException {
	HibernateHelper.getManagedSession().delete(categoria);
    }

    public List<Categoria> getAll() throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Categoria.class);
	criteria.addOrder(Order.asc("descricao"));
	return criteria.list();
    }

    public Categoria getByPrimaryKey(Integer id) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	return (Categoria) session.get(Categoria.class, id);
    }

    public void save(Categoria categoria) throws DAOException {
	HibernateHelper.getManagedSession().saveOrUpdate(categoria);
    }
}
