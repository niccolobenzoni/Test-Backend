package com.api.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.dao.IDaoOperazioni;
import com.api.test.model.Valuta;

@RestController
@RequestMapping("/add")
public class OperazioniController {

	@Autowired
	private IDaoOperazioni dao;
	
	@PostMapping
	public String somma(@RequestBody Valuta v1, Valuta v2) {
		
		return dao.somma(v1, v2);
	}
	
}
