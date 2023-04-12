package com.paycoreandpatika.airportapplication.repository;

import com.paycoreandpatika.airportapplication.models.entities.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passanger,Integer> {
}
