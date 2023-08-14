package com.patikapaycore.project.loanedBook.model.dto.entity;




import com.patikapaycore.project.book.model.entity.Book;
import com.patikapaycore.project.user.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="loaned_books")
public class LoanedBook {

    @Id
    @Column(name="id")
    private String id;


   @NotNull
   @Column(name = "loaned_date")
   private LocalDate loanedDate;

   @NotNull
   @Column(name = "return_date")
   private LocalDate returnDate ;



  
   @ManyToOne(cascade = CascadeType.MERGE,fetch =FetchType.LAZY,targetEntity = User.class)
   @JoinColumn(name = "user_id")
   private User user;


   @ManyToMany(cascade = CascadeType.MERGE,fetch =FetchType.LAZY,targetEntity = Book.class)
   @JoinColumn(name = "book_id")
   private List<Book> books;



}

