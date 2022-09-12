package br.unitins.topicos1.xtrala.model;

public enum TipoVeiculo {
	
	MOTO(1, 2,"Moto"), 
	CARRO(2, 4,"Carro");
	
	private int id;
	private int qtdRodas;
	private String descricao;
	
	//construtor
	TipoVeiculo(int id, int qtdRodas, String descricao) {
		this.id = id;
		this.descricao = descricao;
		this.qtdRodas = qtdRodas;
	}

	//get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
