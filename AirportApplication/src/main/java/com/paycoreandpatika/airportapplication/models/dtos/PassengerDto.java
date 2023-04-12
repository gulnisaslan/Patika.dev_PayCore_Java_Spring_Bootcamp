package com.paycoreandpatika.airportapplication.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private String firstname;
    private String lastname;
    private String gender;
    private String phone;
    private String email;
}
