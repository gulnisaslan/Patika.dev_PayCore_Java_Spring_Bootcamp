package com.patikapaycore.project.user.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.patikapaycore.project.loanedBook.model.dto.entity.LoanedBook;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.Email;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @NotNull(message = "Firstname can not be  null")
    @Column(name = "firstname")
    private String firstname;

    @NotNull(message = "User surname can not be null")
    @Column(name="surname")
    private String surname;

    @NotNull(message = "Username cannot be null")
    @Column(name="username")
    private  String username;

    @Email
    @NotNull(message = "Email cannot be null.")
    @Column(name="email")
    private String email;

    @NotNull(message = "Password cannot be null.")
    @Column(name="password")
    private String password  ;


    @NotNull(message = "Birth Date cannot be null. ")

    @Column(name="birth_date")
    private LocalDate birthDate;

    @NotNull(message="Phone number cannot be null.")
    @Column(name="phone_number")
    private String phoneNumber;


    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private  List<LoanedBook> loanedBooks;




}
