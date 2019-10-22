package br.com.contmatic.estudos.etapa2.colletions.set;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import br.com.contmatic.estudos.etapa2.colletions.aluno.Aluno;

public class SetTest {

	@Test
	public void testSetAluno() {
		Set<Aluno> alunos = new HashSet<>();
		Aluno a = new Aluno("José Silveira", "Informática", 0f);
		Aluno b = new Aluno("Maria dos Santos", "Administração", 0f);
		Aluno c = new Aluno("Joao da Silva", "Informática", 0f);
		Aluno d = new Aluno("José Silveira", "Informática", 0f);
		a.cadastrar(alunos);
		b.cadastrar(alunos);
		c.cadastrar(alunos);
		d.cadastrar(alunos);
		System.out.println(alunos);
	}
}
