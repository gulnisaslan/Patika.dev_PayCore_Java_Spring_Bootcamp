package com.patikapaycore.project.dtos.response;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class BookTypeResponseDto {
    private  String typeName;
}
