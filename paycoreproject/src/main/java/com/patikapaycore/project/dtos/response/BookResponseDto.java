package com.patikapaycore.project.dtos.response;

import com.patikapaycore.project.models.entities.Book;
import com.patikapaycore.project.models.entities.Writer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class BookResponseDto {

    private  String bookTypeName;
    private  String writerName;
    private  String writerLastName;
    private  String bookName;
    private  String isbnNo;
    private String bookDescription;

 

}
