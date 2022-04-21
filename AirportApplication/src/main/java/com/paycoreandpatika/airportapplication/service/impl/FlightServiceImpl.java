package com.paycoreandpatika.airportapplication.service.impl;


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
}
