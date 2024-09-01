package br.com.mdantas.testes;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author marcelo.dantas
 */
public class PrimeiroTeste {

    @Test
    public void test() {
        String nome = "Mahaw";
        Assert.assertEquals("Mahaw", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Mahaw";
        Assert.assertNotEquals("mahaw", nome);
    }
}
