package com.patikapaycore.project.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanedBookRequestDto {

    private  Integer bookId;
    private  Integer userId;
}
