package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.repository.PassengerRepository;
import com.paycoreandpatika.airportapplication.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;




}
