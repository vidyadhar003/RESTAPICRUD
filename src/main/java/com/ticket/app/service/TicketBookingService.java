package com.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ticket.app.dao.TicketBokingDao;
import com.ticket.app.entities.Ticket;

public class TicketBookingService {

	@Autowired
	private TicketBokingDao ticketBokingDao;

	public Ticket createTicket(Ticket ticket) {

		return ticketBokingDao.save(ticket);

	}

	public Ticket getTicketById(Integer ticketId) {

		return ticketBokingDao.findOne(ticketId);

	}

	public Iterable<Ticket> getAllBookedTickets() {

		return ticketBokingDao.findAll();

	}

	public void deleteTicket(Integer ticketId) {

		ticketBokingDao.deleteById(ticketId);

	}

	public Ticket UpdateTicket(Integer ticketId, String newEmail) {

		Ticket ticketFromDb = ticketBokingDao.findOne(ticketId);

		ticketFromDb.setEmail(newEmail);

		Ticket updateTicket = ticketBokingDao.save(ticketFromDb);

		return updateTicket;

	}

}
