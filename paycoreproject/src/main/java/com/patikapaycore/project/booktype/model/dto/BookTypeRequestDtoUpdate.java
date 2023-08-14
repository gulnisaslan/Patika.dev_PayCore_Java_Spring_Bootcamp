package com.patikapaycore.project.booktype.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookTypeRequestDtoUpdate  {
    private Integer id;
    private String typeName;
}
