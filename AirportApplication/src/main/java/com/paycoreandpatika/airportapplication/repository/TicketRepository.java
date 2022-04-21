package com.paycoreandpatika.airportapplication.repository;

import com.paycoreandpatika.airportapplication.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
