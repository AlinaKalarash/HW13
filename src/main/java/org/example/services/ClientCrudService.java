package org.example.services;

import org.example.colums.Client;
import org.example.dao.ClientDao;

public class ClientCrudService {
    private ClientDao clientDao = new ClientDao();

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public Client findClientById(long id) {
        return clientDao.findById(id);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }
}
