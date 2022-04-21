package com.paycoreandpatika.airportapplication.service.impl.controllers;

import com.paycoreandpatika.airportapplication.repository.AirportRepository;
import com.paycoreandpatika.airportapplication.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class AirportController {

    @Autowired
    private final AirportService airportService;


}
