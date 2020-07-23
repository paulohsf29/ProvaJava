package br.com.rd.rdevs.model;

import br.com.rd.rdevs.interfaces.ApresentaDados;
import br.com.rd.rdevs.interfaces.Tributavel;

public class Certidao implements Tributavel, ApresentaDados {
	private int numeroDoRegistro;
	private String nomeRegistrados;
	private String nomeDeclarantes;
	private String tipoDeCertidao;
	private String dataDeEmissao;
	private String nomeTabeliao;
	private String nomeCartorio;
	private double valorEmissao = 45;
	private static int seqControle = 0;
	
	public Certidao(int numeroDoRegistro, String nomeRegistrados,String nomeDeclarantes,String dataDeEmissao, 
			String nomeTabeliao, String nomeCartorio) {
		this.numeroDoRegistro = numeroDoRegistro;
		this.nomeRegistrados = nomeRegistrados;
		this.dataDeEmissao = dataDeEmissao;
		this.nomeTabeliao = nomeTabeliao;
		this.nomeCartorio = nomeCartorio;
		this.nomeDeclarantes = nomeDeclarantes; 
		
		seqControle += 1;
		
	}
	
	//Numero do Registro
	public int getNumeroDoRegistro() {
		return numeroDoRegistro;
	}
	public void setNumeroDoRegistro(int numeroDoRegistro) {
		this.numeroDoRegistro = numeroDoRegistro;
	}
	
	//Nome dos Registrados
	public String getNomeRegistrados() {
		return nomeRegistrados;
	}
	public void setNomeRegistrados(String nomeRegistrados) {
		this.nomeRegistrados = nomeRegistrados;
	}
	
	//Nome dos Declarantes
	public String getNomeDeclarantes() {
		return nomeDeclarantes;
	}
	public void setNomeDeclarantes(String nomeDeclarantes) {
		this.nomeDeclarantes = nomeDeclarantes;
	}
	
	//Data de Emissão
	public String getDataDeEmissao() {
		return dataDeEmissao;
	}
	
	//Tipo de Certidao
	public String getTipoDeCertidao() {
		return tipoDeCertidao;
	}
	public void setTipoDeCertidao(String tipoDeCertidao) {
		this.tipoDeCertidao = tipoDeCertidao;
	}
	
	//Nome do Tabelião
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	
	
	//Nome do Cartorio
	public String getNomeCartorio() {
		return nomeCartorio;
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}
	
	//Valor Emissão
	public double getValorEmissao() {
		return valorEmissao;
	}
	
	public int getseqControle() {
		return seqControle;
	}
	
	@Override
	public double calcularTributos() {
		double impostoGoverno = 45.0;
		double impostoRecursos = 6.50;
		return this.valorEmissao + (impostoGoverno + impostoRecursos);
		
	}

	
	@Override
	public void mostrar() {
		System.out.println("Numero do Registro: "+ this.numeroDoRegistro);
		System.out.println("Nome do Registrado: "+ this.nomeRegistrados);
		System.out.println("Nome do Declarante: "+ this.nomeDeclarantes);
		System.out.println("Tipo de Certidão: "+ this.tipoDeCertidao);
		System.out.println("Data de Emissão: "+ this.dataDeEmissao);
		System.out.println("Nome do Tabelião: "+ this.nomeTabeliao);
		System.out.println("Nome do Cartorio: "+ this.nomeCartorio);
		System.out.println("Valor da Emissão: "+ this.valorEmissao);
		System.out.println("Valor dos Tributos" + calcularTributos());
	}

}
