package com.patikapaycore.project.writer.model.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;

import com.patikapaycore.project.models.entities.Book;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Table(name="writers")
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;


    @NotNull(message = "Writer name cannot be null")
    @Column(name="writer_name")
    private  String writerName;

    @NotNull(message = "Writer surname cannot be null")
    @Column(name="writer_surname")
    private String writerSurname;


    @JsonIgnore
    @OneToMany(mappedBy = "writer")
    private List<Book> books;






}
