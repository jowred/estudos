package br.com.contmatic.estudos.etapa2.enums;

public enum TelefoneType {
	CELULAR("Celular", 9),
	TELEFONE("Telefone", 8);
	
	private String descricao;
	
	private int qtdeDigitos;
	
	private TelefoneType(String descricao, int qtdeDigitos) {
		this.descricao = descricao;
		this.qtdeDigitos = qtdeDigitos;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public int getQtdeDigitos() {
		return qtdeDigitos;
	}
}
