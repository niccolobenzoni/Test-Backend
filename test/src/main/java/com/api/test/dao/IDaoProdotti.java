package com.api.test.dao;

import java.util.List;

import com.api.test.model.Prodotto;

public interface IDaoProdotti {

	List<Prodotto> prodotti();
	
	Prodotto prodotto(int cod);
	
	void add(Prodotto p);
	
	void delete(int cod);
	
	void update(Prodotto p);
	
}
