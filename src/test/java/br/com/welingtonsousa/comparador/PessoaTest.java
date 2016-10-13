package br.com.welingtonsousa.comparador;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {

    private Pessoa anoPassado;
    private Pessoa esteAno;
    private List<Diferenca> diferenca;

    @Before
    public void inicializacao() throws Exception {
	this.anoPassado = new Pessoa("José", "Welington", 25,
		"Dev. Java Junior");
	this.esteAno = new Pessoa("José", "Filho", 26, "Dev. Java Pleno");
	this.diferenca = Comparador.comparar(anoPassado, esteAno);
    }

    @Test
    public void deveVefiricarSeHaDiferenca() {
	assertEquals(3, diferenca.size());
	diferenca.forEach(System.out::println);
    }

}
