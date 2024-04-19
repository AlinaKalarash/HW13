package org.example;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.services.PlanetCrudService;
import org.example.services.TicketCrudService;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        //do smth
        Ticket ticket = session.get(Ticket.class, 1L);
        System.out.println(ticket.getClient());
        session.close();

        //Some Test Here

//        ClientCrudService clientService = new ClientCrudService();
//
        Client client = new Client();
        client.setId(10);
        client.setName("Jessica Garcia");
//        client.setId(11);
//        clientService.saveClient(client);
//
//        clientService.findClientById(11);
//
//        client.setName("Kos");
//        clientService.updateClient(client);
//
//        clientService.findClientById(11);
//
//        Client client1 = clientService.findClientById(11);
//        clientService.deleteClient(client1);

//        PlanetCrudService planetService = new PlanetCrudService();
//
        Planet planet = new Planet();
        planet.setId("LSK");
        planet.setName("Mars");
//        planetService.savePlanet(planet);
//        planetService.deletePlanet(planetService.findPlanetById("NER"));



        TicketCrudService ticketService = new TicketCrudService();

        Ticket ticket1 = new Ticket();
        ticket1.setClient(client);
        ticket1.setFrom_planet(planet);
        ticket1.setTo_planet(planet);
        ticketService.saveTicket(ticket1);



    }
}