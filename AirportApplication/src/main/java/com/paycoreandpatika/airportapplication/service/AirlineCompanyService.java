package com.paycoreandpatika.airportapplication.service;

import com.paycoreandpatika.airportapplication.models.AirlineCompany;
import com.paycoreandpatika.airportapplication.models.Airport;

import java.util.List;

public interface AirlineCompanyService {

    List<AirlineCompany> getAllAirports();
    AirlineCompany getById(Integer id);
    AirlineCompany addAirlineCompany(AirlineCompany airlineCompany);
    void updateAirlineCompany(AirlineCompany airlineCompany);
    boolean deleteAirlineCompany(Integer id);
}
