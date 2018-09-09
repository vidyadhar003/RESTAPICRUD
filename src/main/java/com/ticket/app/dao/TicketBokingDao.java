package com.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticket.app.entities.Ticket;

@Repository
public interface TicketBokingDao  extends CrudRepository<Ticket, Integer>{

	Ticket findOne(Integer ticketId);

}
