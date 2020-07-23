package br.com.rd.rdevs.model;

import br.com.rd.rdevs.interfaces.ApresentaDados;
import br.com.rd.rdevs.interfaces.Tributavel;

public abstract class Contrato implements Tributavel, ApresentaDados{
	private int numeroDoRegistro;
	private String nomeDasPartes;
	private String testemunha1;
	private String testemunha2;
	private String objetoDoContrato;
	private String dataDeEmissao;
	private String dataDeRegistro;
	private String nomeTabeliao;
	private String nomeCartorio;
	private double valorEmissao = 12;
	
	
	public Contrato(int numeroDoRegistro, String nomeDasPartes, String objetoDoContrato, String dataDeEmissao, String dataDeRegistro, 
			String nomeTabeliao, String nomeCartorio) {
		
		this.numeroDoRegistro = numeroDoRegistro;
		this.nomeDasPartes = nomeDasPartes;
		this.objetoDoContrato = objetoDoContrato;
		this.dataDeEmissao = dataDeEmissao;
		this.dataDeRegistro = dataDeRegistro;
		this.nomeTabeliao = nomeTabeliao;
		this.nomeCartorio = nomeCartorio;
		
	}
	
	
	//Numero do Registro
	public int getNumeroDoRegistro() {
		return numeroDoRegistro;
	}
	public void setNumeroDoRegistro(int numeroDoRegistro) {
		this.numeroDoRegistro = numeroDoRegistro;
	}
	
	//Nome das Partes
	public String getNomeDasPartes() {
		return nomeDasPartes;
	}
	public void setNomeDasPartes(String nomeDasPartes) {
		this.nomeDasPartes = nomeDasPartes;
	}
	
	//Nome das Testemunhas
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
	
	//Finalidade do Contrato
	public String getObjetoDoContrato() {
		return objetoDoContrato;
	}
	public void setObjetoDoContrato(String objetoDoContrato) {
		this.objetoDoContrato = objetoDoContrato;
	}
	
	//Data de Emissão
	public String getDataDeEmissao() {
		return dataDeEmissao;
	}
	public void setDataDeEmissao(String dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	
	//Data de Registro
	public String getDataDeRegistro() {
		return dataDeRegistro;
	}
	public void setDataDeRegistro(String dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}
	
	//Nome do Tabelião
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
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
	public void setValorEmissao(double valorEmissao) {
		this.valorEmissao = valorEmissao;
	}


	@Override
	public double calcularTributos() {
		double impostoGoverno = 50;
		double impostoRecursos = 3.50;
		return this.valorEmissao + (impostoGoverno + impostoRecursos);
		
	}
	
	@Override
	public void mostrar() {
		System.out.println("" + this.numeroDoRegistro) ;
		System.out.println("" + this.nomeDasPartes);
		System.out.println("" + this.objetoDoContrato);
		System.out.println("" + this.dataDeEmissao);
		System.out.println("" + this.dataDeRegistro);
		System.out.println("" + this.nomeTabeliao);
		System.out.println("" + this.nomeCartorio);
		System.out.println("" + calcularTributos());
	}

}
