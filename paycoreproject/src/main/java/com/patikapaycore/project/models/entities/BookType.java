package com.patikapaycore.project.models.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book_types")
@Builder
public class BookType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "Book type name cannot be null.")
    @Column(name = "type_name")
    private String typeName;


    @JsonIgnore
    @OneToMany(mappedBy = "bookType" )
    private List<Book> books;





}
