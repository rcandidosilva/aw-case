package br.com.globalcode.dao;

import java.util.List;

import br.com.globalcode.model.BandeiraCartaoCredito;

public interface BandeiraCartaoCreditoDAO {
    void delete(BandeiraCartaoCredito bandeira);

    List getAll();

    BandeiraCartaoCredito getByPrimaryKey(Integer id);

    void save(BandeiraCartaoCredito bandeira);
}
