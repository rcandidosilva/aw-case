package br.com.globalcode.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import br.com.globalcode.dao.DAOException;

public class GenericHibernateDAO<ID extends Serializable, ENT> {
    private Class<ENT> entityClass = null;

    private Class<ENT> getEntityClass() {
	if (entityClass == null) {
	    ParameterizedType paramType = (ParameterizedType) getClass()
		    .getGenericSuperclass();
	    entityClass = (Class<ENT>) paramType.getActualTypeArguments()[0];
	}
	return entityClass;
    }

    public ENT getByPrimaryKey(ID id) throws DAOException {
	return (ENT) HibernateHelper.getById(getEntityClass(), id);
    }

    public void save(ENT ent) throws DAOException {
	HibernateHelper.save(ent);
    }

    public void delete(ENT ent) throws DAOException {
	HibernateHelper.delete(ent);
    }
}
