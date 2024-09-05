package br.com.mdantas;

import br.com.mdantas.dao.ClientDAOMock;
import br.com.mdantas.dao.IClientDAO;
import br.com.mdantas.domain.Client;
import br.com.mdantas.services.ClientService;
import br.com.mdantas.services.IClientService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author marcelo.dantas
 */
public class ClientServiceTest {

    public ClientServiceTest() {
        IClientDAO dao = new ClientDAOMock();
        clientService = new ClientService(dao);
    }

    private IClientService clientService;

    private Client client;

    @Before
    public void init() {
        client = new Client();
        client.setCpf(1231231231L);
        client.setName("Marcelo");
        client.setCity("São Paulo");
        client.setState("SP");
        client.setEnd("End");
        client.setNumber(10);
        client.setTel(11999999999L);
    }

    @Test
    public void searchClient() {
        Client clientConsulted = clientService.searchByCpf(client.getCpf());

        Assert.assertNotNull(clientConsulted);
    }

    @Test
    public void saveClient() {
       Boolean returnn = clientService.save(client);

       Assert.assertTrue(returnn);
    }

    @Test
    public void deleteClient() {
        clientService.delete(client.getCpf());
    }

    @Test
    public void changeClient() {
        client.setName("Mahaw Silva");
        clientService.change(client);

        Assert.assertEquals("Mahaw Silva", client.getName());
    }


}