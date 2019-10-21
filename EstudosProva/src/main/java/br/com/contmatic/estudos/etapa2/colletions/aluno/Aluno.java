package br.com.contmatic.estudos.etapa2.colletions.aluno;

import java.util.Set;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	
	private String curso;
	
	private float nota;
	
	public Aluno(String nome, String curso, float nota) {
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public boolean cadastrar(Set<Aluno> alunos) {
		if (alunos != null) {
			boolean cadastrado = alunos.add(this);
			if (cadastrado) {
				System.out.println("Aluno cadastrado com sucesso.");
			}
			else {
				System.out.println("Não foi possível cadastrar o aluno.");
			}
		}
		return false;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.nome.compareTo(aluno.getNome());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(nota) != Float.floatToIntBits(other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
