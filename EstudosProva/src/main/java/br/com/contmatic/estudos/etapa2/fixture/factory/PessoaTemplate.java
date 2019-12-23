package br.com.contmatic.estudos.etapa2.fixture.factory;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class PessoaTemplate implements TemplateLoader {
	@Override
	public void load() {
		Fixture.of(br.com.contmatic.estudos.etapa2.fixture.factory.Pessoa.class).addTemplate("valido", new Rule() {{
			add("nome", random("Ana", "Júlia", "Amanda", "Fernando", "João", "Afonso", "Renato"));
			add("cpf", random("123456789123", "000000000000"));
			add("rg", "544577896");
			add("idade", random(12, 34, 78, 60, 16, 17, 15, 21, 27, 29));
		}});
	}
}
