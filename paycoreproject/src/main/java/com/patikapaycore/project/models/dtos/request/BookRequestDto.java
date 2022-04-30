package com.patikapaycore.project.models.dtos.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class BookRequestDto {
    private  String bookTypeName;
    private  String  writerName;
    private  String  writerSurname;
    private  String bookName;
    private  String isbnNo;
    private String bookDescription;
}
