package br.com.mdantas.testes;

import br.com.mdantas.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author marcelo.dantas
 */

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Mahaw");

        Assert.assertEquals("Mahaw", cli.getNome());
    }
}