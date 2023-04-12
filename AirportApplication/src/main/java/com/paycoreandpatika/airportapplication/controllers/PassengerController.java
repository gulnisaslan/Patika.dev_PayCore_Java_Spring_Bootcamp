package com.paycoreandpatika.airportapplication.controllers;

import com.paycoreandpatika.airportapplication.service.PassengerService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/passengers")
public class PassengerController {
    private  final PassengerService passengerService;
  
 
    public PassengerController(PassengerService passengerService) {
        this.passengerService=passengerService;
    }


}
