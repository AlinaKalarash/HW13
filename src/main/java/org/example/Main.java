package org.example;

import org.example.colums.Client;
import org.example.services.ClientCrudService;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        //do smth
        session.close();

        //Some Test Here

        ClientCrudService clientService = new ClientCrudService();

        Client client = new Client();
        client.setName("Katya");
        client.setId(11);
        clientService.saveClient(client);

        clientService.findClientById(11);

        client.setName("Kos");
        clientService.updateClient(client);

        clientService.findClientById(11);

        Client client1 = clientService.findClientById(11);
        clientService.deleteClient(client1);
    }
}