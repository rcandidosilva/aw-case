package br.com.globalcode.dao.hibernate;

import br.com.globalcode.dao.BancoDAO;
import br.com.globalcode.dao.BancoDAOImpl;
import br.com.globalcode.dao.BandeiraCartaoCreditoDAO;
import br.com.globalcode.dao.BandeiraCartaoCreditoDAOImpl;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.PagamentoDAO;
import br.com.globalcode.dao.PedidoDAO;
import br.com.globalcode.dao.ProdutoDAO;

public class HibernateFactory implements DAOFactory {
    public ClienteDAO getClienteDAO() {
	return new ClienteHibernate();
    }

    public CategoriaDAO getCategoriaDAO() {
	return new CategoriaHibernate();
    }

    public BancoDAO getBancoDAO() {
	return new BancoDAOImpl();
    }

    public BandeiraCartaoCreditoDAO getBandeiraCartaoCreditoDAO() {
	return new BandeiraCartaoCreditoDAOImpl();
    }

    public PagamentoDAO getPagamentoDAO() {
	return new PagamentoHibernate();
    }

    public PedidoDAO getPedidoDAO() {
	return new PedidoHibernate();
    }

    public ProdutoDAO getProdutoDAO() {
	return new ProdutoHibernate();
    }
}
