package com.api.test.dao;

import org.springframework.stereotype.Repository;

import com.api.test.model.Valuta;

@Repository
public class DaoOperazioni implements IDaoOperazioni{

	String v1 = "5p 14s 8d";
	String v2 = "6p 14s 8d";
	
	@Override
	public String somma(Valuta v1, Valuta v2) {
		String ris = "";
		
		int pounds1 = Integer.parseInt(v1.getValore().substring(0, v1.getValore().indexOf("p")));
		int shillings1 = Integer.parseInt(v1.getValore().substring(v1.getValore().indexOf("p")+2, v1.getValore().indexOf("s")));
		int pences1 = Integer.parseInt(v1.getValore().substring(v1.getValore().indexOf("s")+2, v1.getValore().indexOf("d")));
		
		int pounds2 = Integer.parseInt(v2.getValore().substring(0, v2.getValore().indexOf("p")));
		int shillings2 = Integer.parseInt(v2.getValore().substring(v2.getValore().indexOf("p")+2, v2.getValore().indexOf("s")));
		int pences2 = Integer.parseInt(v2.getValore().substring(v2.getValore().indexOf("s")+2, v2.getValore().indexOf("d")));
		
		int fpounds = pounds1 + pounds2;
		int fshillings = shillings1 + shillings2;
		int fpences = pences1 + pences2;
		
		if(fpences >= 12) {
			fshillings += fpences /12;
			fpences = fpences - 12;
			
		}
		
		if(fshillings >=20) {
			fpounds += fshillings /20;
			fshillings = fshillings - 20;
			
		}
		
		ris = fpounds + "p " + fshillings + "s " + fpences + "d";
		
		return ris;
	}

	
	
}
