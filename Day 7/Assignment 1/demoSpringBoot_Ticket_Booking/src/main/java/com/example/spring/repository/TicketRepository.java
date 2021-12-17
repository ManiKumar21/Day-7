package com.example.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring.model.Ticket;

@Component
public class TicketRepository {

	private List<Ticket> allTickets;

	public TicketRepository() {
		allTickets = new ArrayList<Ticket>();
		allTickets.add(new Ticket(1,"SRS Travels","Bangalore","Pune"));
		allTickets.add(new Ticket(2,"VRL Travels","Mumbai","Goa"));
	}
	
	public Ticket addTicket(Ticket ticket) {
		allTickets.add(ticket);
		return ticket;
	}
	
	public List<Ticket> getTickets(){
		return allTickets;
	}
	
	public int deleteTicket(int id)
	{
		Ticket t = allTickets.remove(id);
		return t.getId();
	}
}
