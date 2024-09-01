package br.com.mdantas.testes;

import br.com.mdantas.dao.ClienteDao;
import br.com.mdantas.dao.mocks.ClienteDaoMock;
import br.com.mdantas.dao.IClienteDao;
import br.com.mdantas.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author marcelo.dantas
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
