package com.paycoreandpatika.airportapplication.service;

import com.paycoreandpatika.airportapplication.models.entities.Flight;

import java.util.List;

public interface FlightService {
       List<Flight> getAllFlight();

       Flight getById();

      Flight addFlight(Flight flight);

      void updateFlight(Flight flight);

      boolean deleteFlight(Integer id);

}
