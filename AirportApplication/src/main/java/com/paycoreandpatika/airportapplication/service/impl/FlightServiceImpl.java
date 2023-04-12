package com.paycoreandpatika.airportapplication.service.impl;


import java.util.List;

import com.paycoreandpatika.airportapplication.models.entities.Flight;
import com.paycoreandpatika.airportapplication.repository.FlightRepository;
import com.paycoreandpatika.airportapplication.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private  final FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> getAllFlight() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flight getById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flight addFlight(Flight flight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean deleteFlight(Integer id) {
        // TODO Auto-generated method stub
        return false;
    }
}
