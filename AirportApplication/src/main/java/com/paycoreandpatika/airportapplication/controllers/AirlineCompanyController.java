package com.paycoreandpatika.airportapplication.controllers;

import com.paycoreandpatika.airportapplication.service.AirlineCompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class AirlineCompanyController {

    @Autowired
    private final AirlineCompanyService airlineCompanyService;


}
