package org.example.services;

import org.example.dao.TicketDao;
import org.example.entity.Ticket;

public class TicketCrudService {
    private TicketDao ticketDao = new TicketDao();

    public void saveTicket(Ticket ticket) {
        ticketDao.create(ticket);
    }

    public Ticket findTicketById(long id) {
        return ticketDao.findById(id);
    }

    public void updateTicket(Ticket ticket) {
        ticketDao.update(ticket);
    }

    public void deleteTicket(Ticket ticket) {
        ticketDao.delete(ticket);
    }
}
