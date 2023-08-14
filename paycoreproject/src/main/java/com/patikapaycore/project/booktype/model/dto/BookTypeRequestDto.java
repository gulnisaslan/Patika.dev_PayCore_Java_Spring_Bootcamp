package com.patikapaycore.project.booktype.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class BookTypeRequestDto {
    private  String typeName;
}
