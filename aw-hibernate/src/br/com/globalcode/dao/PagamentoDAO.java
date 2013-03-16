package br.com.globalcode.dao;

import java.util.List;

import br.com.globalcode.model.Pagamento;

public interface PagamentoDAO {
    void delete(Pagamento pagamento) throws DAOException;

    List getAll() throws DAOException;

    Pagamento getByPrimaryKey(Integer id) throws DAOException;

    Pagamento save(Pagamento pagamento) throws DAOException;
}
