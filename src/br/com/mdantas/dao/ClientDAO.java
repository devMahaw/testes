package br.com.mdantas.dao;

import br.com.mdantas.domain.Client;

/**
 * @author marcelo.dantas
 */
public class ClientDAO implements IClientDAO {

    @Override
    public Boolean save(Client client) {
        return true;
    }

    @Override
    public Client searchByCpf(Long cpf) {
        return null;
    }

    @Override
    public void delete(Long cpf) {

    }

    @Override
    public void change(Client client) {

    }
}
