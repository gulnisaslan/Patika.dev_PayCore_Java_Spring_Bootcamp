package com.patikapaycore.project.book.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class BookRequestDtoUpdate {
    private Integer id;
    private  Integer writerId;
    private  Integer bookTypeId;
    private  String bookName;
    private  String isbnNo;
    private String bookDescription;
}
