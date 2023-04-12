package com.paycoreandpatika.airportapplication.controllers;

import com.paycoreandpatika.airportapplication.models.dtos.AirlineCompanyDto;
import com.paycoreandpatika.airportapplication.models.entities.AirlineCompany;
import com.paycoreandpatika.airportapplication.service.AirlineCompanyService;


import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(name="api/v1/airlinecompanies")
public class AirlineCompanyController {

    private final AirlineCompanyService airlineCompanyService;
    
    public AirlineCompanyController(AirlineCompanyService airlineCompanyService) {
        this.airlineCompanyService = airlineCompanyService;
    }
    @GetMapping("/getallairports")
    public List<AirlineCompanyDto> getAllAirports(){
        return airlineCompanyService.getAllAirports();
    }
    @GetMapping("/getByAirlineCompany/{id}")
    public  AirlineCompanyDto getByAirlineCompany(@PathVariable("id") Integer id) {
        return  this.airlineCompanyService.getById(id);
    }

    @GetMapping("/getallairport")
    public List<AirlineCompany> getAirlineCompanies(){
        return this.airlineCompanyService.getAirlineCompanies();
    }
    @PostMapping("/saveAirlineCompany")
   public AirlineCompanyDto addAirlineCompany(@RequestBody   AirlineCompanyDto airlineCompanyDto){
          return this.airlineCompanyService.addAirlineCompany(airlineCompanyDto);
   }
   @PutMapping("/updateAirlineCompany")
    AirlineCompanyDto updateAirlineCompany(@RequestBody AirlineCompany airlineCompany){
        return this.airlineCompanyService.updateAirlineCompany(airlineCompany);
    }
    @DeleteMapping("/delete/{id}")
    boolean deleteAirlineCompany(@PathVariable("id") Integer id){
        return this.airlineCompanyService.deleteAirlineCompany(id);
    }


}
