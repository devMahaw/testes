package br.com.mdantas.testes;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author marcelo.dantas
 */
public class SegundoTeste {

    @Test
    public void test2() {
        String nome = "Maria";
        Assert.assertEquals("Maria", nome);
    }
}
