package com.patikapaycore.project.writer.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class WriterRequestDto {
    private String writerName;
    private  String writerSurname;
}
