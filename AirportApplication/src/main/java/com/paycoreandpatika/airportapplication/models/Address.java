package com.paycoreandpatika.airportapplication.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Address {
    @NotBlank
    private String city;
    @NotBlank
    private String province;
    private String streetCode;
    private Integer buildingNo;
}
