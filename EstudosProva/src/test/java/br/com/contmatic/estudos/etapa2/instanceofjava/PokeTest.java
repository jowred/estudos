package br.com.contmatic.estudos.etapa2.instanceofjava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.contmatic.estudos.etapa2.instanceofjava.Bulbasaur;
import br.com.contmatic.estudos.etapa2.instanceofjava.Charmander;
import br.com.contmatic.estudos.etapa2.instanceofjava.Mewtwo;
import br.com.contmatic.estudos.etapa2.instanceofjava.Pokemon;
import br.com.contmatic.estudos.etapa2.instanceofjava.Squirtle;

public class PokeTest {
	Pokemon poke;
	
	@Before
	public void setUp() {
		poke = new Pokemon();
	}
	
	@After
	public void tearDown() {
		poke = null;
	}
	
	@Test
	public void deve_retornar_true_apontando_instancia_de_charmander() {
		poke = new Charmander();
		assertTrue(poke instanceof Charmander);
	}
	
	@Test
	public void deve_retornar_true_apontando_instancia_de_squirtle() {
		poke = new Squirtle();
		assertTrue(poke instanceof Squirtle);
	}
	
	@Test
	public void deve_retornar_true_apontando_instancia_de_bulbasaur() {
		poke = new Bulbasaur();
		assertTrue(poke instanceof Bulbasaur);
	}
	
	@Test
	public void deve_retornar_true_apontando_instancia_de_pokemon() {
		assertTrue(poke instanceof Pokemon);
	}
	
	@Test
	public void deve_retornar_false_nao_apontando_instancia_dos_seguintes_pokemon() {
		poke = new Mewtwo();
		assertFalse(poke instanceof Bulbasaur || 
				poke instanceof Charmander || 
				poke instanceof Squirtle);
	}
	
	@Test
	public void deve_retornar_true_apontando_instancia_de_pokemon_devido_a_heranca() {
		poke = new Mewtwo();
		assertTrue(poke instanceof Mewtwo);
	}

}
