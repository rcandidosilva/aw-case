package br.com.globalcode.dao.hibernate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.globalcode.dao.DAOException;
import br.com.globalcode.dao.PedidoDAO;
import br.com.globalcode.model.Cliente;
import br.com.globalcode.model.Pedido;

public class PedidoHibernate implements PedidoDAO {
    private static SimpleDateFormat format = new SimpleDateFormat(
	    "dd/MM/yyyy HH:mm");
    private static SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");

    public void delete(Pedido pedido) throws DAOException {
	HibernateHelper.getManagedSession().delete(pedido);
    }

    public List getAll() throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Pedido.class);
	criteria.addOrder(Order.asc("dataCompra"));
	List pedidos = criteria.list();
	completarPagamentos(pedidos);
	return pedidos;
    }

    public List getByCliente(Cliente cliente) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Pedido.class);
	criteria.add(Restrictions.eq("cliente", cliente));
	criteria.addOrder(Order.asc("dataCompra"));
	List pedidos = criteria.list();
	completarPagamentos(pedidos);
	return pedidos;
    }

    public List getByFormaPagamento(String pagamento) {
	return Collections.EMPTY_LIST;
    }

    public List getByPeriodo(String strDataInicio, String strDataFinal)
	    throws DAOException {
	Date dataInicio = null;
	Date dataFinal = null;
	try {
	    dataInicio = format.parse(strDataInicio);
	    dataFinal = format.parse(strDataFinal);
	} catch (ParseException e) {
	    try {
		dataInicio = format2.parse(strDataInicio);
		dataFinal = format2.parse(strDataFinal);
	    } catch (ParseException e2) {
		throw new DAOException(
			"Formato invalido de datas. Formato esperado: "
				+ format.toPattern() + " ou "
				+ format2.toPattern(), e2);
	    }
	}
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Pedido.class);
	criteria.add(Restrictions.ge("dataCompra", dataInicio));
	criteria.add(Restrictions.le("dataCompra", dataFinal));
	criteria.addOrder(Order.asc("dataCompra"));
	List pedidos = criteria.list();
	completarPagamentos(pedidos);
	return pedidos;
    }

    public Pedido getByPrimaryKey(Long numero) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Pedido p = (Pedido) session.get(Pedido.class, numero);
	PagamentoHibernate.completarPagamento(p.getPagamento());
	return p;
    }

    public void save(Pedido pedido) throws DAOException {
	HibernateHelper.getManagedSession().saveOrUpdate(pedido);
    }

    private void completarPagamentos(List pedidos) {
	for (int i = 0; i < pedidos.size(); i++) {
	    Pedido p = (Pedido) pedidos.get(i);
	    PagamentoHibernate.completarPagamento(p.getPagamento());
	}
    }
}
