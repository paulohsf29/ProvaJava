package br.com.rd.rdevs.util;

import br.com.rd.rdevs.model.Certidao;

public class CertidaoNacimento extends Certidao {
	private String dataDeNascimento;
	private String nomeMae;
	private String nomePai;
	private String nomeMedico;
	private String sexo;
	private String ufNascimento;
	private String cidadeNascimento;
	private String hospital;
		
	public CertidaoNacimento(int numeroDoRegistro, String nomeRegistrados, String nomeDeclarantes, String dataDeEmissao,
			String nomeTabeliao, String nomeCartorio, String dataDeNascimento, String nomeMae, String nomePai,
			String nomeMedico, String sexo, String ufNascimento, String cidadeNascimento, String hospital) {
		super(numeroDoRegistro, nomeRegistrados, nomeDeclarantes, dataDeEmissao, nomeTabeliao, nomeCartorio);
		this.dataDeNascimento = dataDeNascimento;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.nomeMedico = nomeMedico;
		this.sexo = sexo;
		this.ufNascimento = ufNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.setHospital(hospital);
		super.setTipoDeCertidao("Certidão de Nascimento");
	
	}
	
	//Data de Nascimento
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	//Nome Da Mae
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	//Nome do Pai
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	//Nome do Médico
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	//Sexo
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	//Estado de nascimento (UF)
	public String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	
	//Cidade de Nascimento
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	//Hospital de nascimento
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("" + this.dataDeNascimento);
		System.out.println("" + this.nomeMae);
		System.out.println("" + this.nomePai);
		System.out.println("" + this.nomeMedico);
		System.out.println("" + this.sexo);
		System.out.println("" + this.ufNascimento);
		System.out.println("" + this.cidadeNascimento);
		System.out.println("" + this.hospital);
		System.out.println("-------------");
	}

}
