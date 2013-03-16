package br.com.globalcode.dao;

import java.util.List;

import br.com.globalcode.model.Cliente;
import br.com.globalcode.model.Pedido;

public interface PedidoDAO {
    void delete(Pedido pedido) throws DAOException;

    List getAll() throws DAOException;

    List getByCliente(Cliente cliente) throws DAOException;

    List getByFormaPagamento(String pagamento);

    List getByPeriodo(String strDataInicio, String strDataFinal)
	    throws DAOException;

    Pedido getByPrimaryKey(Long numero) throws DAOException;

    void save(Pedido pedido) throws DAOException;
}
