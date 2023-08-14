package com.patikapaycore.project.booktype.model.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class BookTypeResponseDto {
    private  String typeName;
}
