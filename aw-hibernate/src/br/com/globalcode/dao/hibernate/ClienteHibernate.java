package br.com.globalcode.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOException;
import br.com.globalcode.model.Cliente;

public class ClienteHibernate implements ClienteDAO {
    public void delete(Cliente cliente) throws DAOException {
	HibernateHelper.getManagedSession().delete(cliente);
    }

    public List getAll() throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Cliente.class);
	criteria.addOrder(Order.asc("nome"));
	return criteria.list();
    }

    public Cliente getByEmail(String email) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Cliente.class);
	criteria.add(Restrictions.eq("email", email));
	criteria.setMaxResults(1); // desnecessario se existisse
	// uma unique key na coluna email
	return (Cliente) criteria.uniqueResult();
    }

    public List getByNome(String nome) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Cliente.class);
	criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
	criteria.addOrder(Order.asc("nome"));
	return criteria.list();
    }

    public Cliente getByPrimaryKey(Integer id) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	return (Cliente) session.get(Cliente.class, id);
    }

    public Cliente save(Cliente cliente) throws DAOException {
	HibernateHelper.getManagedSession().saveOrUpdate(cliente);
	return cliente;
    }
}
