package br.com.contmatic.estudos.prova02.colletions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import br.com.contmatic.estudos.etapa2.colletions.aluno.Aluno;

public class ListTest {

	@Test
	public void testDesempenhoArrayList() {
		final int MAX = 200000;
		long inicio = System.currentTimeMillis();
		List<Integer> lista = new ArrayList<>();
		for(int i=0; i<MAX; i++) {
			lista.add(i);
		}
		for(int i=0; i<MAX; i++) {
			lista.contains(i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de operação: " + (fim - inicio)/1000 + " segundos.");
	}
	
	@Test
	public void testOrdenacaoList() {
		List<String> alunos = new ArrayList<>();
		alunos.add("João da Silva");
		alunos.add("Maria dos Santos");
		alunos.add("José Silveira");
		alunos.add("Antônio Sousa");
		alunos.add("Lúcia Ferreira");
		System.out.println(alunos);
		Collections.sort(alunos);
		System.out.println(alunos);
	}
	
	@Test
	public void testOrdenacaoAluno() {
		List<Aluno> alunos = new ArrayList<>();
		Aluno a = new Aluno("José Silveira", "Informática", 0f);
		Aluno b = new Aluno("Maria dos Santos", "Administração", 0f);
		Aluno c = new Aluno("Joao da Silva", "Informática", 0f);
		alunos.add(a);
		alunos.add(b);
		alunos.add(c);
		System.out.println(alunos);
		Collections.sort(alunos);
		System.out.println(alunos);
	}
	
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
