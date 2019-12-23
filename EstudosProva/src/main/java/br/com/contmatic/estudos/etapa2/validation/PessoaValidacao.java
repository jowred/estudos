package br.com.contmatic.estudos.etapa2.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class PessoaValidacao {
	
	private static final String NOME_MIN_MAX = "Nome deve ter de {min} a {max} caracteres.";

	private static final String NOME_NULO_VAZIO = "Nome não pode ser nulo ou vazio.";

	@Length(min = 2, max = 100, message = NOME_MIN_MAX)
	@NotBlank(message = NOME_NULO_VAZIO)
	private String nome;
	
	@NotNull(message = "CPF não pode ser nulo.")
	@CPF(message = "CPF inválido.")
	private String cpf;
	
	@NotNull(message = "RG não pode ser nulo.")
	private String rg;
	
	@Min(value = 0, message = "A idade não pode ser menor que 0.")
	@Max(value = 115, message = "A idade não pode ser maior que 115.")
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void validar(Validator validator) {
		Set<ConstraintViolation<PessoaValidacao>> violations = validator.validate(this);
		if (violations.isEmpty()) {
			System.out.println("Validado com sucesso.");
		} else {
			for(ConstraintViolation<PessoaValidacao> violation : violations) {
				System.out.println((violation.getMessage()));
			}
		}
	}
}
