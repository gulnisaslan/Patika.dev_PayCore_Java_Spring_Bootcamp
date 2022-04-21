package com.paycoreandpatika.airportapplication.repository;

import com.paycoreandpatika.airportapplication.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
