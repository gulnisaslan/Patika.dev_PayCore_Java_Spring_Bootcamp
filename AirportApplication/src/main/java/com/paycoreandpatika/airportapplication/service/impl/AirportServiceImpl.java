package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.models.entities.Airport;
import com.paycoreandpatika.airportapplication.repository.AirportRepository;
import com.paycoreandpatika.airportapplication.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public List<Airport> getAllAirports() {
        return null;
    }

    @Override
    public Airport getAirport(Integer id) {
        return null;
    }

    @Override
    public boolean addAirport(Airport airport) {
        return false;
    }

    @Override
    public Airport updateAirport(Airport airport) {
        return null;
    }

    @Override
    public boolean deleteAirport(Integer id) {
        return false;
    }
}
