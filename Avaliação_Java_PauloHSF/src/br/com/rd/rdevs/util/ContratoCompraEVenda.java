package br.com.rd.rdevs.util;

import br.com.rd.rdevs.model.Contrato;

public class ContratoCompraEVenda extends Contrato {
	private double valorDaVenda;
	private String vendedor;
	private String dataPosse;
	
	public ContratoCompraEVenda(int numeroDoRegistro, String nomeDasPartes, String objetoDoContrato,
			String dataDeEmissao, String dataDeRegistro, String nomeTabeliao, String nomeCartorio) {
		super(numeroDoRegistro, nomeDasPartes, objetoDoContrato, dataDeEmissao, dataDeRegistro, nomeTabeliao, nomeCartorio);
	}

	//Valor da venda
	public double getValorDaVenda() {
		return valorDaVenda;
	}
	public void setValorDaVenda(double valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}
	
	//Nome do Vendedor
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	// Data da Posse
	public String getDataPosse() {
		return dataPosse;
	}
	public void setDataPosse(String dataPosse) {
		this.dataPosse = dataPosse;
	}
	
	
	public void mostrar() {
		super.mostrar();
		System.out.println("" + this.valorDaVenda);
		System.out.println("" + this.vendedor);
		System.out.println("" + this.dataPosse);
	}
	
}
