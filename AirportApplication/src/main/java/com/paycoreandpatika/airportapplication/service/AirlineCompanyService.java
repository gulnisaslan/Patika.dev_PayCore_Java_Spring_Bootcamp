package com.paycoreandpatika.airportapplication.service;

import com.paycoreandpatika.airportapplication.models.dtos.AirlineCompanyDto;
import com.paycoreandpatika.airportapplication.models.entities.AirlineCompany;

import java.util.List;

public interface AirlineCompanyService {

    List<AirlineCompanyDto> getAllAirports();
    AirlineCompanyDto getById(Integer id);
    AirlineCompanyDto addAirlineCompany(AirlineCompanyDto airlineCompanyDto);
    AirlineCompanyDto updateAirlineCompany(AirlineCompany airlineCompanyDto);
    boolean deleteAirlineCompany(Integer id);
    List<AirlineCompany> getAirlineCompanies();
}
