package br.com.rd.rdevs.util;

import br.com.rd.rdevs.model.Certidao;

public class CertidaoObito extends Certidao{
	private String dataNascimento;
	private String dataObito;
	private String causaDaMorte;
	
	

	public CertidaoObito(int numeroDoRegistro, String nomeRegistrados, String nomeDeclarantes, String dataDeEmissao,
			String nomeTabeliao, String nomeCartorio, String dataNascimento, String dataObito, String causaDaMorte) {
		super(numeroDoRegistro, nomeRegistrados, nomeDeclarantes, dataDeEmissao, nomeTabeliao, nomeCartorio);
		super.setTipoDeCertidao("Certidão de Óbito");
		this.dataNascimento = dataNascimento;
		this.dataObito = dataObito;
		this.causaDaMorte = causaDaMorte;
		
	}

	//Data de Nascimento
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	//Data do Óbito
	public String getDataObito() {
		return dataObito;
	}
	public void setDataObito(String dataObito) {
		this.dataObito = dataObito;
	}

	//Causa da Morte
	public String getCausaDaMorte() {
		return causaDaMorte;
	}
	public void setCausaDaMorte(String causaDaMorte) {
		this.causaDaMorte = causaDaMorte;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Data Nascimentos: " + this.dataNascimento);
		System.out.println("Data Obito: " + this.dataObito);
		System.out.println("Causa da Morte: " + this.causaDaMorte);
		System.out.println("-------------");
	}
}
