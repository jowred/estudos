package br.com.contmatic.estudos.prova02.guava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.contmatic.estudos.etapa2.guava.Pessoa;

import static com.google.common.base.Preconditions.checkState;

public class PessoaTest {
	private Pessoa p;
	
	@Before
	public void setUp() {
		p = new Pessoa();
		for(int i=0; i<5; i++)
			p.getFilhos().add(new Pessoa());
	}
	
	@After
	public void tearDown() {
		p = null;
	}
	
	//IDADE
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_idade_nula() {
		p.setIdade(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_idade_negativa() {
		p.setIdade(-25);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_idade_positiva_superior_a_120_anos() {
		p.setIdade(121);
	}
	
	@Test
	public void deve_aceitar_idade_positiva_ate_120_anos() {
		p.setIdade(22);
	}
	
	//NOME
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_nome_nulo() {
		p.setNome(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_nome_em_branco() {
		p.setNome("");
	}
	
	@Test
	public void deve_aceitar_nome_valido() {
		p.setNome("Jonathan");
	}
	
	//CPF
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_cpf_nulo() {
		p.setCpf(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_cpf_em_branco() {
		p.setCpf("");
	}
	
	@Test
	public void deve_aceitar_cpf() {
		p.setCpf("12345678978");
	}
	
	//RG
	@Test(expected = NullPointerException.class)
	public void nao_deve_aceitar_rg_nulo() {
		p.setRg(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_rg_em_branco() {
		p.setRg("");
	}
	
	//FILHOS
	@Test(expected = IndexOutOfBoundsException.class)
	public void nao_deve_aceitar_indice_maior_que_o_tamanho_da_lista() {
		p.getFilho(6);
	}
	
	@Test
	public void deve_aceitar_indice_dentro_dos_limites_da_lista() {
		p.getFilho(4);
	}
	
	//checkState()
	@Test(expected = IllegalStateException.class)
	public void nao_deve_permitir_continuacao_com_estado_nao_desejado() {
		int a = 2;
		checkState(a <= 1, "a não pode ser maior que 1 (valor atual: %s)", a);
	}
	
	@Test
	public void deve_permitir_continuacao_com_estado_desejado() {
		int a = 1;
		checkState(a <= 1, "a não pode ser maior que 1 (valor atual: %s)", a);
	}
}
