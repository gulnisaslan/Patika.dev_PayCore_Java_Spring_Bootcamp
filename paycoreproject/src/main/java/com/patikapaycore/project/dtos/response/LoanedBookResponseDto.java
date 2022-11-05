package com.patikapaycore.project.dtos.response;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class LoanedBookResponseDto {


     private String userFullName;
     private  String bookName;
     private WriterResponseDto writerName;
     private LocalDate loanedDate;
     private  LocalDate returnDate;


}
