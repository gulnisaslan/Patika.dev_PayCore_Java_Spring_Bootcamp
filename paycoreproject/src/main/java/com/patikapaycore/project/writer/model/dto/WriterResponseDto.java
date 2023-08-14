package com.patikapaycore.project.writer.model.dto;

import com.patikapaycore.project.writer.model.entity.Writer;

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
