package br.com.contmatic.estudos.etapa2.validation;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.contmatic.estudos.etapa2.validation.PessoaValidacao;

public class PessoaValidacaoTest {

	private PessoaValidacao pv;
	
	private ValidatorFactory factory;
	
	private Validator validator;
	
	@Before
	public void setUp() {
		pv = new PessoaValidacao();
		factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@After
	public void tearDown() {
		pv = null;
		factory = null;
		validator = null;
	}
	
	@Test
	public void deve_validar_todos_os_campos() {
		pv.setNome("Ryu");
		pv.setIdade(30);
		pv.setCpf("79286364091");
		pv.setRg("537895445");
		pv.validar(validator);
	}
	
	@Test
	public void nao_deve_validar_nenhum_campo() {
		pv.setNome(null);
		pv.setIdade(-1);
		pv.setCpf("75894587458");
		pv.setRg(null);
		pv.validar(validator);
	}
}
