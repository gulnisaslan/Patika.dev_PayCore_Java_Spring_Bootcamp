package com.paycoreandpatika.airportapplication.models.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @NotBlank
    @Column(name="departure_airport_id")
    private Integer departureAirportId;

    @NotBlank
    @Column(name="arrival_airport_id")
    private Integer arrivalAirportId;


}
