package com.patikapaycore.project.loanedBook.model.dto;



import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanedBookRequestDto {

    private  Set<Integer> bookId;
    private  Integer userId;
}
