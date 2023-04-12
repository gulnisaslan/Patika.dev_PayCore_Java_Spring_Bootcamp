package com.paycoreandpatika.airportapplication.service.impl;

import com.paycoreandpatika.airportapplication.models.dtos.AirlineCompanyDto;

import com.paycoreandpatika.airportapplication.models.entities.AirlineCompany;

import com.paycoreandpatika.airportapplication.repository.AirlineCompanyRepository;
import com.paycoreandpatika.airportapplication.service.AirlineCompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AirlineCompanyServiceImpl implements AirlineCompanyService {

    private final AirlineCompanyRepository airlineCompanyRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public AirlineCompanyServiceImpl(AirlineCompanyRepository airlineCompanyRepository, ModelMapper modelMapper) {
        this.airlineCompanyRepository = airlineCompanyRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AirlineCompanyDto> getAllAirports() {
        List<AirlineCompany> allCompanies = this.airlineCompanyRepository.findAll();
        return allCompanies.stream()
                .map(allCompany -> modelMapper.map(allCompany, AirlineCompanyDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public AirlineCompanyDto getById(Integer id) {
        Optional<AirlineCompany> airlineCompany = Optional.ofNullable(this.airlineCompanyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException()));
        return modelMapper.map(airlineCompany,AirlineCompanyDto.class);
    }

    @Override
    public AirlineCompanyDto addAirlineCompany(AirlineCompanyDto airlineCompanyDto) {
        AirlineCompany save = this.airlineCompanyRepository.save(modelMapper.map(airlineCompanyDto, AirlineCompany.class));
       
        return modelMapper.map(save,AirlineCompanyDto.class);
    }

    @Override
    public AirlineCompanyDto updateAirlineCompany(AirlineCompany airlineCompanyDto) {
     
        AirlineCompany updateAirlineCompany = this.airlineCompanyRepository.findById(airlineCompanyDto.getId())
                .orElseThrow(() -> new EntityNotFoundException());
      
      
                updateAirlineCompany.setName(airlineCompanyDto.getName()==null?airlineCompanyDto.getName():updateAirlineCompany.getName());
        AirlineCompany updatedAirlineCompany = this.airlineCompanyRepository.save(updateAirlineCompany);
        return modelMapper.map(updatedAirlineCompany,AirlineCompanyDto.class);
    }

    @Override
    public boolean deleteAirlineCompany(Integer id) {
        AirlineCompany airlineCompany = this.airlineCompanyRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        this.airlineCompanyRepository.delete(airlineCompany);

        return true;
    }

    @Override
    public List<AirlineCompany> getAirlineCompanies() {
        // TODO Auto-generated method stub
       return this.airlineCompanyRepository.findAll();
    }
}



