package br.com.mdantas.services;

import br.com.mdantas.dao.ClientDAO;
import br.com.mdantas.dao.IClientDAO;
import br.com.mdantas.domain.Client;

/**
 * @author marcelo.dantas
 */
public class ClientService implements IClientService {

    public ClientService(IClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    private IClientDAO clientDAO;

    @Override
    public Boolean save(Client client) {
        return clientDAO.save(client);
    }

    @Override
    public Client searchByCpf(Long cpf) {
        return clientDAO.searchByCpf(cpf);
    }

    @Override
    public void delete(Long cpf) {
        clientDAO.delete(cpf);
    }

    @Override
    public void change(Client client) {
        clientDAO.change(client);
    }
}
