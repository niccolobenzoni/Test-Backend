package com.api.test.model;

public class Valuta {

	private String valore;

	public Valuta(String valore) {
		super();
		this.valore = valore;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	@Override
	public String toString() {
		return "Valuta [valore=" + valore + "]";
	}
	
}
