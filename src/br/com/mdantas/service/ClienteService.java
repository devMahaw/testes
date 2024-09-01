package br.com.mdantas.service;

import br.com.mdantas.dao.ClienteDao;
import br.com.mdantas.dao.IClienteDao;

/**
 * @author marcelo.dantas
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
