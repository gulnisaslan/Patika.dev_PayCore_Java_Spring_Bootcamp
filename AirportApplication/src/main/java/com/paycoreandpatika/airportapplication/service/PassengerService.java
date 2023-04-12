package com.paycoreandpatika.airportapplication.service;

import com.paycoreandpatika.airportapplication.models.dtos.PassengerDto;

import java.util.List;

public interface PassengerService {
    List<PassengerDto> getAllPassengers();

    PassengerDto getByPassengerId(Integer id);

    PassengerDto addPassenger(PassengerDto passengerDto);

    PassengerDto updatePassenger(PassengerDto passengerDto);

    boolean deletePassenger(Integer id);




}
