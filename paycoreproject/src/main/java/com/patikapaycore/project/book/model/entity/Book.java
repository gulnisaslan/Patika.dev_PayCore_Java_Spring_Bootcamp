package com.patikapaycore.project.book.model.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.patikapaycore.project.loanedBook.model.dto.entity.LoanedBook;
import com.patikapaycore.project.booktype.model.entity.BookType;
import com.patikapaycore.project.writer.model.entity.Writer;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;



    @NotNull(message="Book name cannot be null.")
    @Column(name = "book_name")
    @Size(min = 1,max=50)
    private String bookName;


    @NotNull
    @Column(name = "isbn_no")
    private String isbnNo;

    @Column(name = "book_description")
    private  String bookDescription;

 //   @JsonIgnore
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY, targetEntity = BookType.class)
    @JoinColumn(name = "book_type_id",referencedColumnName = "id")
    private BookType bookType;

   // @JsonIgnore
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY, targetEntity = Writer.class)
    @JoinColumn(name = "writer_id",referencedColumnName = "id")
    private Writer writer;

    @JsonIgnore
    @OneToMany(mappedBy = "books",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private List<LoanedBook> loanedBooks;


}



