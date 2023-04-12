package com.paycoreandpatika.airportapplication.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  Integer id;

    @NotBlank
    @Column(name="name")
    private String name;

    @NotBlank
    @Column(name="address")
    private String address;
    
    @Transient
    private List<Address> addresses;
    public List<Address> formatToAddressList(){
        String[] splitedAddress = address.split("//");
        List<Address>  resultFormat = new ArrayList<>();
        Arrays.stream(splitedAddress).forEach(split-> {String[] spilted = split.trim().split("/");
    resultFormat.add(new Address(spilted[0], spilted[1]));});
    return resultFormat;

    }

    







}
