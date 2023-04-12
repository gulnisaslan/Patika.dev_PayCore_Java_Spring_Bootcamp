package com.paycoreandpatika.airportapplication.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="passenger")
public class Passanger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;

    @NotBlank
    @Column(name="firstname")
    private String firstname;

    @NotBlank
    @Column(name="lastname")
    private String lastname;


    @Column(name="gender")
    private String gender;


    @Column(name="phone")
    private String phone;


    @NotBlank
    @Email
    @Column(name="email", unique = true )
    private String email;

}
