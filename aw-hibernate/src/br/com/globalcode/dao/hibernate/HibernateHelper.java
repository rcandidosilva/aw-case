package br.com.globalcode.dao.hibernate;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.globalcode.dao.DAOException;

public class HibernateHelper {
    
    private static SessionFactory sessionFactory;

    static SessionFactory getSessionFactory() {
	return sessionFactory;
    }

    static void setSessionFactory(SessionFactory aSessionFactory) {
	sessionFactory = aSessionFactory;
    }

    public static Session getManagedSession(boolean forceTransaction) {
        //Session s = sessionFactory.openSession();
	Session s = sessionFactory.getCurrentSession();
	if (forceTransaction && !s.getTransaction().isActive()) {
	    s.beginTransaction();
	}
	return s;
    }

    public static Session getManagedSession() {
	return getManagedSession(true);
    }

    public static Transaction getTransaction() {
	return getManagedSession(true).getTransaction();
    }

    public static List execQuery(String hql) throws DAOException {
	return execQuery(hql, null);
    }

    public static List execQuery(String hql, Map params) throws DAOException {
	Session session = null;
	Transaction tx = null;
	try {
	    session = getSessionFactory().openSession();
	    tx = session.beginTransaction();
	    Query query = session.createQuery(hql);
	    if (params != null && params.size() > 0) {
		Iterator itParamNames = params.keySet().iterator();
		while (itParamNames.hasNext()) {
		    String paramName = (String) itParamNames.next();
		    Object value = params.get(paramName);
		    query.setParameter(paramName, value);
		}
	    }
	    List retorno = query.list();
	    tx.commit();
	    return retorno;
	} catch (HibernateException hbe) {
	    if (tx != null)
		tx.rollback();
	    throw new DAOException(hbe);
	} finally {
	    if (session != null)
		session.close();
	}
    }

    public static void save(Object obj) throws DAOException {
	Session session = null;
	Transaction tx = null;
	try {
	    //session = getSessionFactory().openSession();
            session = getManagedSession();
	    tx = session.beginTransaction();
	    session.saveOrUpdate(obj);
	    tx.commit();
	} catch (HibernateException hbe) {
	    if (tx != null)
		tx.rollback();
	    throw new DAOException(hbe);
	} finally {
	    if (session != null)
		session.close();
	}
    }

    public static Object getById(Class klass, Serializable id)
	    throws DAOException {
	Session session = null;
	Transaction tx = null;
	try {
	    session = getSessionFactory().openSession();
	    tx = session.beginTransaction();
	    Object obj = session.get(klass, id);
	    tx.commit();
	    return obj;
	} catch (HibernateException hbe) {
	    if (tx != null)
		tx.rollback();
	    throw new DAOException(hbe);
	} finally {
	    if (session != null)
		session.close();
	}
    }

    public static void delete(Object obj) throws DAOException {
	Session session = null;
	Transaction tx = null;
	try {
	    session = getSessionFactory().openSession();
	    tx = session.beginTransaction();
	    session.delete(obj);
	    tx.commit();
	} catch (HibernateException hbe) {
	    if (tx != null)
		tx.rollback();
	    throw new DAOException(hbe);
	} finally {
	    if (session != null)
		session.close();
	}
    }
}
