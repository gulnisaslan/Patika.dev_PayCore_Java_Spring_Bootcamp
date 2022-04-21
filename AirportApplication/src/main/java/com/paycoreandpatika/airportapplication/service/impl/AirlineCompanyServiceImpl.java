package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.models.AirlineCompany;
import com.paycoreandpatika.airportapplication.repository.AirlineCompanyRepository;
import com.paycoreandpatika.airportapplication.service.AirlineCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineCompanyServiceImpl implements AirlineCompanyService {

    private final AirlineCompanyRepository airlineCompanyRepository;

    @Autowired
    public AirlineCompanyServiceImpl(AirlineCompanyRepository airlineCompanyRepository) {
        this.airlineCompanyRepository = airlineCompanyRepository;
    }

    @Override
    public List<AirlineCompany> getAllAirports() {
        return null;
    }

    @Override
    public AirlineCompany getById(Integer id) {
        return null;
    }

    @Override
    public AirlineCompany addAirlineCompany(AirlineCompany airlineCompany) {
        return null;
    }

    @Override
    public void updateAirlineCompany(AirlineCompany airlineCompany) {

    }

    @Override
    public boolean deleteAirlineCompany(Integer id) {
        return false;
    }
}
