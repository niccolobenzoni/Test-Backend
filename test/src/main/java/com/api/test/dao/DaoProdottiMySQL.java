package com.api.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.api.test.model.Prodotto;
import com.api.test.util.BasicDao;

@Repository
public class DaoProdottiMySQL extends BasicDao implements IDaoProdotti{

	public DaoProdottiMySQL(
			@Value("${db.address}") String dbAddress,
			@Value("${db.user}") String user,
			@Value("${db.psw}") String password	) {
		
		super(dbAddress, user, password);
	}

	private Prodotto prodottoFromMap(Map<String, String> map) {
		Prodotto p = new Prodotto();
		p.fromMap(map);
		return p;
	}

	@Override
	public List<Prodotto> prodotti() {
		List<Prodotto> ris = new ArrayList<>();
		
		List<Map<String, String>> maps = getAll("SELECT * FROM catalogo");
		
		for (Map<String, String> map : maps) {
			ris.add(prodottoFromMap(map));
		}
		
		return ris;
	}


	@Override
	public Prodotto prodotto(int cod) {
		Prodotto ris = null;
		
		Map<String, String> map = getOne("SELECT * FROM catalogo WHERE cod = ?", cod);
		
		if(map != null) {
			ris = prodottoFromMap(map);
		}
		
		return ris;
	}

	@Override
	public void add(Prodotto p) {
		
		execute("INSERT INTO catalogo (nome,prezzo) values (?,?)", p.getNome(), p.getPrezzo());
		
	}

	@Override
	public void delete(int cod) {
		
		execute("DELETE FROM catalogo WHERE cod = ?", cod);
		
	}

	@Override
	public void update(Prodotto p) {

		execute("UPDATE catalogo SET nome = ?, prezzo = ? WHERE cod = ?", 
					p.getNome(),
					p.getPrezzo(),
					p.getCod()	
					);
		
	}

}
