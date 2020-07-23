package br.com.rd.rdevs.util;

import br.com.rd.rdevs.model.Contrato;

public class ContratoTrabalho extends Contrato{
	private String contratante;
	private String cnpjContratante;
	

	public ContratoTrabalho(int numeroDoRegistro, String nomeDasPartes, String objetoDoContrato, String dataDeEmissao,
			String dataDeRegistro, String nomeTabeliao, String nomeCartorio, String contratante,
			String cnpjContratante) {
		super(numeroDoRegistro, nomeDasPartes, objetoDoContrato, dataDeEmissao, dataDeRegistro, nomeTabeliao, nomeCartorio);
		// TODO Auto-generated constructor stub
	}

	//Empresa Contratante
	public String getContratante() {
		return contratante;
	}
	public void setContratante(String contratante) {
		this.contratante = contratante;
	}

	//CNPJ Contratante
	public String getCnpjContratante() {
		return cnpjContratante;
	}
	public void setCnpjContratante(String cnpjContratante) {
		this.cnpjContratante = cnpjContratante;
	}
	
	public void mostrars() {
		super.mostrar();
		System.out.println("" + this.contratante);
		System.out.println("" + this.cnpjContratante);
	}
	
}
