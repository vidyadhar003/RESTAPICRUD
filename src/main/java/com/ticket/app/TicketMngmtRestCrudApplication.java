package com.ticket.app;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ticket.app.entities.Ticket;
import com.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketMngmtRestCrudApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketMngmtRestCrudApplication.class,
				args);

		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",
				TicketBookingService.class);

		Ticket ticket = new Ticket();

		ticket.setBookingDate(new Date(02 / 01 / 2019));

		ticket.setDestStation("Amalner");
		ticket.setSourceStation("Pune");

		ticket.setEmail("Vidyadhar3@hotmail.com");
		ticket.setPassengerName("Vidyadhar");
		
		ticketBookingService.createTicket(ticket);
		

	}
}
