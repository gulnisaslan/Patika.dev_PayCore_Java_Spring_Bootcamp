package com.patikapaycore.project.dtos.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class WriterRequestDto {
    private String writerName;
    private  String writerSurname;
}
