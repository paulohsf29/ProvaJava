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
		super.setTipoDeCertidao("Certidão de Propriedade");
		this.setEndereco(endereco);
		this.setTipo(tipo);
		this.setArea(area);
	}
	
	//Endereço do Imóvel
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//Tipo do imóvel
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Area do imóvel m²
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
