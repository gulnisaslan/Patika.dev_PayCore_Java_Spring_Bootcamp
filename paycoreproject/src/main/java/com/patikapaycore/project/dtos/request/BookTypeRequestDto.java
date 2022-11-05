package com.patikapaycore.project.dtos.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class BookTypeRequestDto {
    private  String typeName;
}
