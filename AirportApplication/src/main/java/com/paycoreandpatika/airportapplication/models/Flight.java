package com.paycoreandpatika.airportapplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @NotBlank
    @Column(name="code")
    private String code;

    @Column(name="quota")
    private Integer qouta;

    @Column(name="price")
    private  Integer price;

    @Column(name="departure_date")
    @NotBlank
    private Date departureDate;

    @Column(name="route_id")
    @NotBlank
    private Integer routeId;

    @Column(name="airline_company_id")
    @NotBlank
    private Integer airlineCompanyId;
}
