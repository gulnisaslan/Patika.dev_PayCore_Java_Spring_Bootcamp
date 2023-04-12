package com.paycoreandpatika.airportapplication.repository;

import com.paycoreandpatika.airportapplication.models.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport,Integer> {
}
