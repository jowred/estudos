package br.com.contmatic.estudos.etapa2.constantes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstantesTest {

	private static final String MSG_NULO_VAZIO = " não pode ser nulo ou vazio.";
	private static final String NOME_NULO_VAZIO = "Nome" + MSG_NULO_VAZIO;
	
	@Test
	public void testConstanteComConstanteConcatenada() {
		System.out.println(MSG_NULO_VAZIO);
		System.out.println(NOME_NULO_VAZIO);
	}

}
