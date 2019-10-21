package br.com.contmatic.estudos.etapa2.fixture.factory;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkElementIndex;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private Integer idade;
	private List<Pessoa> filhos;
	
	public Pessoa() {
		filhos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		checkNotNull(nome, "Nome não pode ser nulo.");
		checkArgument(!nome.equals(""), "Nome não estar em branco.");
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		checkNotNull(cpf, "CPF não pode ser nulo.");
		checkArgument(!cpf.equals(""), "CPF não pode estar em branco.");
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		checkNotNull(rg, "RG não pode ser nulo.");
		checkArgument(!rg.equals(""), "RG não pode estar em branco.");
		this.rg = rg;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		checkNotNull(idade, "Idade não pode ser nula.");
		checkArgument(idade >= 0, "A idade é negativa (%s).", idade);
		checkArgument(idade <= 120, "A idade não pode ser superior a 120 anos (%s).", idade);
		this.idade = idade;
	}
	
	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Pessoa> filhos) {
		this.filhos = filhos;
	}

	public Pessoa getFilho(int index) {
		checkElementIndex(index, filhos.size());
		return filhos.get(index);
	}
}
