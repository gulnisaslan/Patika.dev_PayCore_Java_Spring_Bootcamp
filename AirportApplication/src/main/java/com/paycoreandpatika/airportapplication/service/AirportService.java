package com.paycoreandpatika.airportapplication.service;

import com.paycoreandpatika.airportapplication.models.entities.Airport;

import java.util.List;

public interface AirportService {
     List<Airport> getAllAirports();
     Airport getAirport(Integer id);
     boolean addAirport(Airport airport);
     Airport updateAirport(Airport airport);
     boolean deleteAirport(Integer id);



}
