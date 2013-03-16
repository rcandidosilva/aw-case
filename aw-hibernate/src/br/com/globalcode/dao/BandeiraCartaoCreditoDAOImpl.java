package br.com.globalcode.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.globalcode.model.BandeiraCartaoCredito;

public class BandeiraCartaoCreditoDAOImpl implements BandeiraCartaoCreditoDAO {
    private static List bandeiras = null;
    static {
	ArrayList arrayList = new ArrayList(4);
	arrayList.add(new BandeiraCartaoCredito(new Integer(1), "Visa"));
	arrayList.add(new BandeiraCartaoCredito(new Integer(2), "Mastercard"));
	arrayList.add(new BandeiraCartaoCredito(new Integer(3),
		"American Express"));
	arrayList.add(new BandeiraCartaoCredito(new Integer(4), "Dinners"));
	bandeiras = Collections.unmodifiableList(arrayList);
    }

    public void delete(BandeiraCartaoCredito bandeira) {
    }

    public List getAll() {
	return bandeiras;
    }

    public BandeiraCartaoCredito getByPrimaryKey(Integer id) {
	BandeiraCartaoCredito bandeira = null;
	for (int i = 0; i < bandeiras.size(); i++) {
	    BandeiraCartaoCredito bandeiraDaLista = (BandeiraCartaoCredito) bandeiras
		    .get(i);
	    if (bandeiraDaLista.getId().equals(id))
		bandeira = bandeiraDaLista;
	}
	return bandeira;
    }

    public void save(BandeiraCartaoCredito bandeira) {
    }
}
