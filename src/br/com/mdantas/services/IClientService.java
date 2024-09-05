package br.com.mdantas.services;

import br.com.mdantas.domain.Client;

/**
 * @author marcelo.dantas
 */
public interface IClientService {

    Boolean save(Client client);

    Client searchByCpf(Long cpf);

    void delete(Long cpf);

    void change(Client client);
}
