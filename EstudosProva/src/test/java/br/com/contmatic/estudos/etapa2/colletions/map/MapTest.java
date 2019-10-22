package br.com.contmatic.estudos.etapa2.colletions.map;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import br.com.contmatic.estudos.etapa2.colletions.aluno.Aluno;

public class MapTest {

	@Test
	public void testTreeMapOrdenacao() {
		Map<String, Aluno> alunos = new TreeMap<>();
		Aluno a = new Aluno("João da Silva", "Linux Básico", 0f);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0f);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0f);
		Aluno d = new Aluno("Benedito Silva", "OpenOffice", 0f);
		alunos.put(a.getNome(), a);
		alunos.put(b.getNome(), b);
		alunos.put(c.getNome(), c);
		alunos.put(d.getNome(), d);
		System.out.println(alunos);
		System.out.println(alunos.get("Lúcia Ferreira").getCurso());
		Collection<Aluno> colecao = alunos.values();
		for(Aluno x : colecao) {
			System.out.println(x.getNome());
		}
	}
}
