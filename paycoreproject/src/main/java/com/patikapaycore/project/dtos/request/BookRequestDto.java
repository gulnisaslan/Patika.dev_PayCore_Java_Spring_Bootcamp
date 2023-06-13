package com.patikapaycore.project.dtos.request;



import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class BookRequestDto {

    private  Integer writerId;
    private  Integer bookTypeId;
    private  String bookName;
    private  String isbnNo;
    private String bookDescription;
}
