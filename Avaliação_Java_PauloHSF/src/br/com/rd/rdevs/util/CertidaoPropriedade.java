package br.com.rd.rdevs.util;

import br.com.rd.rdevs.model.Certidao;

public class CertidaoPropriedade extends Certidao {
	private String endereco;
	private String tipo;
	private double area;

	public CertidaoPropriedade(int numeroDoRegistro, String nomeRegistrados, String nomeDeclarantes,
			String dataDeEmissao, String nomeTabeliao, String nomeCartorio, String endereco,
			String tipo, double area) {
		super(numeroDoRegistro, nomeRegistrados, nomeDeclarantes, dataDeEmissao, nomeTabeliao, nomeCartorio);
		super.setTipoDeCertidao("Certid�o de Propriedade");
		this.setEndereco(endereco);
		this.setTipo(tipo);
		this.setArea(area);
	}
	
	//Endere�o do Im�vel
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//Tipo do im�vel
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Area do im�vel m�
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("" + this.endereco);
		System.out.println("" + this.tipo);
		System.out.println("" + this.area);
		System.out.println("-------------");
	}
	
}
