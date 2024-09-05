package br.com.mdantas.dao;

import br.com.mdantas.domain.Client;

/**
 * @author marcelo.dantas
 */
public interface IClientDAO {

    Boolean save(Client client);

    Client searchByCpf(Long cpf);

    void delete(Long cpf);

    void change(Client client);
}
