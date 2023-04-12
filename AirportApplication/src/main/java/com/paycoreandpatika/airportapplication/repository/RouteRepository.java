package com.paycoreandpatika.airportapplication.repository;

import com.paycoreandpatika.airportapplication.models.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route,Integer> {
}
