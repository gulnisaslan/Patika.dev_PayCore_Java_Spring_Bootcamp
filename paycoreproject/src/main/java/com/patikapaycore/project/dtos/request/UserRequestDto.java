package com.patikapaycore.project.dtos.request;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class UserRequestDto {
    private String firstName;
    private String surname;
    private String username;
    private String email;
    private String password;
    private LocalDate birthDate;
    private String phoneNumber;
}
