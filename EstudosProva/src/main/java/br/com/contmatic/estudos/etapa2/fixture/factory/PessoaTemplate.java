package br.com.contmatic.estudos.etapa2.fixture.factory;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class PessoaTemplate implements TemplateLoader {
	@Override
	public void load() {
		Fixture.of(br.com.contmatic.estudos.etapa2.fixture.factory.Pessoa.class).addTemplate("valido", new Rule() {{
			add("nome", random("Ana", "Júlia"));
			add("cpf", random("123456789123", "000000000000"));
			add("rg", "544577896");
		}});
	}
}
