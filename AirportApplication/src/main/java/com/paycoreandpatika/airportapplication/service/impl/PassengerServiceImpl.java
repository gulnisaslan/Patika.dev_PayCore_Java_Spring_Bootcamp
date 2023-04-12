package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.models.dtos.PassengerDto;
import com.paycoreandpatika.airportapplication.models.entities.Passanger;
import com.paycoreandpatika.airportapplication.repository.PassengerRepository;
import com.paycoreandpatika.airportapplication.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;
    private final ModelMapper modelMapper;

    public PassengerServiceImpl(PassengerRepository passengerRepository, ModelMapper modelMapper) {
        this.passengerRepository = passengerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PassengerDto> getAllPassengers() {
        List<Passanger> passangers = this.passengerRepository.findAll();
        return passangers
                .stream()
                .map(passanger -> modelMapper.map(passangers,PassengerDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PassengerDto getByPassengerId(Integer id) {
        return null;
    }

    @Override
    public PassengerDto addPassenger(PassengerDto passengerDto) {

        return null;
    }

    @Override
    public PassengerDto updatePassenger(PassengerDto passengerDto) {
        return null;
    }

    @Override
    public boolean deletePassenger(Integer id) {

        return false;
    }
}
