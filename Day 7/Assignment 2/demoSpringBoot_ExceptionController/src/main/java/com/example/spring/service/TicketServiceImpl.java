package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Ticket;
import com.example.spring.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository ticketRepository;
;
	
	
	@Override
	public Ticket addTicket(Ticket ticket) {
		Ticket bTicket = ticketRepository.addTicket(ticket);
		return bTicket;
	}

	@Override
	public List<Ticket> getTickets() {
		List<Ticket> tickets = ticketRepository.getTickets();
		return tickets;
	}

	@Override
	public int deleteTicket(int delete) {
		int delticket =0;
		delticket = ticketRepository.deleteTicket(delete);
		return delticket;
	}
	
	

}
