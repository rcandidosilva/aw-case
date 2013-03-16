package br.com.globalcode.dao;

import java.util.List;

import br.com.globalcode.model.Cliente;

public interface ClienteDAO {
    public void delete(Cliente cliente) throws DAOException;

    public List getAll() throws DAOException;

    public Cliente getByEmail(String email) throws DAOException;

    public List getByNome(String nome) throws DAOException;

    public Cliente getByPrimaryKey(Integer id) throws DAOException;

    public Cliente save(Cliente cliente) throws DAOException;
}
