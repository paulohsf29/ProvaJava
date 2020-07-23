package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.List;

import br.com.rd.rdevs.util.CertidaoObito;

public class Testa {

	public static void main(String[] args) {
		CertidaoObito co1 = new  CertidaoObito(345, "Paulo HSF", "Leo","23/07/2020", 
				"Astolfo", "Cartorio da correria", "29/10/1996", "23/07/2020", "Prova de Java");
		
		CertidaoObito co2 = new  CertidaoObito(345, "Jãozinho", "Cicilio","23/10/2010", 
				"Claudia", "Cartorio da lerdesa", "30/01/1950", "20/10/2010", "Infarto");
		
		CertidaoObito co3 = new  CertidaoObito(345, "Mariazinha","Luana","03/10/2013", 
				"Creusa", "Cartorio da correria", "05/04/1976", "05/10/2013", "Amor");
		
		List<CertidaoObito> certidoes = new ArrayList<>();
		
		certidoes.add(co1);
		certidoes.add(co2);
		certidoes.add(co3);
		
	}

}
