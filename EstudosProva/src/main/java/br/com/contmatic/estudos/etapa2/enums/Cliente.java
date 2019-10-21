package br.com.contmatic.estudos.etapa2.enums;

public class Cliente {

	private TelefoneType telefone;
	
	private int cod;

	public TelefoneType getTelefone() {
		return telefone;
	}

	public void setTelefone(TelefoneType telefone) {
		this.telefone = telefone;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "Código do cliente: " + cod + "\n"
				+ "Tipo de telefone: " + telefone.getDescricao() + "\n"
				+ "Quantidade de dígitos: " + telefone.getQtdeDigitos();
	}
	
	
}
