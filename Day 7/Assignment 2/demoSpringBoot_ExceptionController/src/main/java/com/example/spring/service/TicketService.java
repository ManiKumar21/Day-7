package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.model.Ticket;


public interface TicketService {

	
	public Ticket addTicket(Ticket ticket);
	
	
	public List<Ticket> getTickets();
	
	public int deleteTicket(int delete);
	
}
