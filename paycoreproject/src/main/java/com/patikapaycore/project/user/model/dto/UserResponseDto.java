package com.patikapaycore.project.user.model.dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    
    private String firstName;
 private  String surname;
    private String email;
    private String password;
    private LocalDate birthDate;
    private String phoneNumber;
}
