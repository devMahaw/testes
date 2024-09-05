package br.com.mdantas.dao;

import br.com.mdantas.domain.Client;

/**
 * @author marcelo.dantas
 */
public class ClientDAOMock implements IClientDAO {
    @Override
    public Boolean save(Client client) {
        return true;
    }

    @Override
    public Client searchByCpf(Long cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }

    @Override
    public void delete(Long cpf) {

    }

    @Override
    public void change(Client client) {

    }
}
