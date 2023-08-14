package com.patikapaycore.project.writer.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * WriterUpdateDto
 */   
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
    
public class WriterUpdateDto {
    private Integer id;
     private String writerName;
    private  String writerSurname;

}