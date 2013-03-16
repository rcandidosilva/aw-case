package br.com.globalcode.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.globalcode.dao.BancoDAO;
import br.com.globalcode.dao.BandeiraCartaoCreditoDAO;
import br.com.globalcode.dao.DAOException;
import br.com.globalcode.dao.PagamentoDAO;
import br.com.globalcode.model.Banco;
import br.com.globalcode.model.BandeiraCartaoCredito;
import br.com.globalcode.model.Pagamento;
import br.com.globalcode.model.PagamentoBoleto;
import br.com.globalcode.model.PagamentoCartaoCredito;

public class PagamentoHibernate implements PagamentoDAO {
    private static BancoDAO bancoDAO = null;
    private static BandeiraCartaoCreditoDAO bandeiraDAO = null;
    static {
	HibernateFactory hibernateFactory = new HibernateFactory();
	bancoDAO = hibernateFactory.getBancoDAO();
	bandeiraDAO = hibernateFactory.getBandeiraCartaoCreditoDAO();
    }

    public void delete(Pagamento pagamento) throws DAOException {
	HibernateHelper.getManagedSession().delete(pagamento);
    }

    public List getAll() throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Criteria criteria = session.createCriteria(Pagamento.class);
	criteria.addOrder(Order.asc("dataPagamento"));
	List lista = criteria.list();
	for (int i = 0; i < lista.size(); i++) {
	    completarPagamento((Pagamento) lista.get(i));
	}
	return lista;
    }

    public Pagamento getByPrimaryKey(Integer id) throws DAOException {
	Session session = HibernateHelper.getManagedSession();
	Pagamento pagamento = (Pagamento) session.get(Pagamento.class, id);
	completarPagamento(pagamento);
	return pagamento;
    }

    public Pagamento save(Pagamento pagamento) throws DAOException {
	HibernateHelper.getManagedSession().saveOrUpdate(pagamento);
	return pagamento;
    }

    static void completarPagamento(Pagamento pagamento) {
	if (pagamento == null || pagamento.getId() == null) {
	    return;
	}
	if (pagamento instanceof PagamentoBoleto) {
	    PagamentoBoleto pagamentoBoleto = (PagamentoBoleto) pagamento;
	    Banco banco = bancoDAO.getByPrimaryKey(pagamentoBoleto.getBanco()
		    .getId());
	    pagamentoBoleto.setBanco(banco);
	} else if (pagamento instanceof PagamentoCartaoCredito) {
	    PagamentoCartaoCredito pagamentoCartaoCredito = (PagamentoCartaoCredito) pagamento;
	    BandeiraCartaoCredito bandeira = bandeiraDAO
		    .getByPrimaryKey(pagamentoCartaoCredito.getId());
	    pagamentoCartaoCredito.setBandeiraCartaoCredito(bandeira);
	}
    }
}
