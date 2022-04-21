package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.repository.RouteRepository;
import com.paycoreandpatika.airportapplication.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    private  final RouteRepository routeRepository;

    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }
}
