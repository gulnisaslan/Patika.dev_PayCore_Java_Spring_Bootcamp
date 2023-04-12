package com.patikapaycore.project.dtos.response;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class BookResponseDto {

    private  String bookTypeName;
    private  String writerName;
    private  String writerSurname;
    private  String bookName;
    private  String isbnNo;
    private String bookDescription;

 

}
