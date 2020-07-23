package br.com.rd.rdevs.util;

import br.com.rd.rdevs.model.Certidao;

public class CertidaoCasamento extends Certidao {
	private String regimeDeBens;
	private String testemunha1;
	private String testemunha2;
	
	
	public CertidaoCasamento(int numeroDoRegistro, String nomeRegistrados, String nomeDeclarantes, String dataDeEmissao,
			String nomeTabeliao, String nomeCartorio, String regimeDeBens, String testemunha1 ,String testemunha2) {
		super(numeroDoRegistro, nomeRegistrados, nomeDeclarantes, dataDeEmissao, nomeTabeliao, nomeCartorio);
		
		super.setTipoDeCertidao("Certidão de Casamento");
		this.regimeDeBens = regimeDeBens;
		this.testemunha1 = testemunha1;
		this.testemunha2 = testemunha2;
	}

	//Tipo de Regime de Bens
	public String getRegimeDeBens() {
		return regimeDeBens;
	}
	public void setRegimeDeBens(String regimeDeBens) {
		this.regimeDeBens = regimeDeBens;
	}

	//Testemunhas
	public String getTestemunha1() {
		return testemunha1;
	}
	public void setTestemunha1(String testemunha1) {
		this.testemunha1 = testemunha1;
	}
	public String getTestemunha2() {
		return testemunha2;
	}
	public void setTestemunha2(String testemunha2) {
		this.testemunha2 = testemunha2;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("" + this.regimeDeBens);	
		System.out.println("" + this.testemunha1);
		System.out.println("" + this.testemunha2);
		System.out.println("-------------");
	}
	
	
}
