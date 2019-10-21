package br.com.contmatic.estudos.prova02.fixture.factory;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class FixtureFactoryTest {
	br.com.contmatic.estudos.etapa2.fixture.factory.Pessoa p;
	
	@BeforeClass
	public static void setUp() {
		FixtureFactoryLoader.loadTemplates("br.com.contmatic.estudos.prova02.fixture.factory");
	}
	
	@Test
	public void test() {
		p = Fixture.from(br.com.contmatic.estudos.etapa2.fixture.factory.Pessoa.class).gimme("valido");
		System.out.println(p.getNome());
	}

}
