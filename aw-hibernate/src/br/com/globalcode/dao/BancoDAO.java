package br.com.globalcode.dao;

import java.util.List;

import br.com.globalcode.model.Banco;

public interface BancoDAO {
    void delete(Banco banco);

    List getAll();

    Banco getByPrimaryKey(Integer id);

    void save(Banco banco);
}
