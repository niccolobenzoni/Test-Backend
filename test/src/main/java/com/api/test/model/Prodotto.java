package com.api.test.model;

import com.api.test.util.IMappablePro;

public class Prodotto implements IMappablePro{

	private int cod;
	private String nome;
	private String prezzo;
	
	public Prodotto(int cod, String nome, String prezzo) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public Prodotto() {
		super();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto [cod=" + cod + ", nome=" + nome + ", prezzo=" + prezzo + "]";
	}

}
