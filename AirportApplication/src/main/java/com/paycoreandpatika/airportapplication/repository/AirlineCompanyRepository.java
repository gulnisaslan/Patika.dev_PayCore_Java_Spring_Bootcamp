package com.paycoreandpatika.airportapplication.repository;

import com.paycoreandpatika.airportapplication.models.entities.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineCompanyRepository extends JpaRepository<AirlineCompany,Integer> {

}
