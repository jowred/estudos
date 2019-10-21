package br.com.contmatic.estudos.prova02.enums;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.contmatic.estudos.etapa2.enums.Cliente;
import br.com.contmatic.estudos.etapa2.enums.TelefoneType;

public class TelefoneTypeTest {

	private Cliente c;
	
	@Before
	public void setUp() {
		c = new Cliente();
	}
	
	@After
	public void tearDown() {
		c = null;
	}
	
	@Test
	public void testEnum() {
		c.setTelefone(TelefoneType.CELULAR);
		c.setCod(1);
		assertNotNull(c.getCod());
		assertNotNull(c.getTelefone());
		System.out.println(c);
	}

}
