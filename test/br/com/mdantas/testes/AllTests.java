package br.com.mdantas.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author marcelo.dantas
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ PrimeiroTeste.class, SegundoTeste.class, TesteClienteTest.class, ContratoServiceTest.class, ClienteServiceTest.class })
public class AllTests {
}
