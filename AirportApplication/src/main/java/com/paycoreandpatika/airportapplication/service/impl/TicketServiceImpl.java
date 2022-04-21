package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.repository.TicketRepository;
import com.paycoreandpatika.airportapplication.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
