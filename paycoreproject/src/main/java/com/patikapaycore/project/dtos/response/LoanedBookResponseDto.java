package com.patikapaycore.project.dtos.response;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

import com.patikapaycore.project.models.entities.Book;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class LoanedBookResponseDto {


     private String userFullName;
     private List<Book> books;
     private WriterResponseDto writerName;
     private LocalDate loanedDate;
     private  LocalDate returnDate;


}
