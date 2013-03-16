package br.com.globalcode.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.globalcode.model.Banco;

public class BancoDAOImpl implements BancoDAO {
    private static List bancos = null;
    static {
	ArrayList arrayList = new ArrayList(3);
	arrayList.add(new Banco(new Integer(1), "Banco do Brasil"));
	arrayList.add(new Banco(new Integer(2), "Bradesco"));
	arrayList.add(new Banco(new Integer(3), "Itau"));
	bancos = Collections.unmodifiableList(arrayList);
    }

    public void delete(Banco banco) {
    }

    public List getAll() {
	return bancos;
    }

    public Banco getByPrimaryKey(Integer id) {
	Banco banco = null;
	for (int i = 0; i < bancos.size(); i++) {
	    Banco bancoDaLista = (Banco) bancos.get(i);
	    if (bancoDaLista.getId().equals(id))
		banco = bancoDaLista;
	}
	return banco;
    }

    public void save(Banco banco) {
    }
}
