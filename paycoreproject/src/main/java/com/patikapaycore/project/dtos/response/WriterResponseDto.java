package com.patikapaycore.project.dtos.response;

import com.patikapaycore.project.models.entities.Writer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class WriterResponseDto {
    private String writerName;
    private  String writerSurname;

    public Writer toWriter(){
        return Writer.builder()
        .writerName(writerName)
        .writerSurname(writerSurname)
        .build();
    }
}
