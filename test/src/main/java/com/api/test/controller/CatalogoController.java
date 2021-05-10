package com.api.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.dao.IDaoProdotti;
import com.api.test.model.Prodotto;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

	@Autowired
	private IDaoProdotti dao;
	
	@GetMapping
	public List<Prodotto> get(){
		return dao.prodotti();
	}
	
	@GetMapping("/{cod}")
	public Prodotto prodotto(@PathVariable int cod) {
		return dao.prodotto(cod);
	}
	
	@PostMapping
	public void add(@RequestBody Prodotto prodotto) {
		dao.add(prodotto);
	}
	
	@DeleteMapping("/{cod}")
	public void delete(@PathVariable int cod) {
		dao.delete(cod);
	}
	
	@PutMapping
	public void update(@RequestBody Prodotto prodotto) {
		dao.update(prodotto);
	}
	
}
