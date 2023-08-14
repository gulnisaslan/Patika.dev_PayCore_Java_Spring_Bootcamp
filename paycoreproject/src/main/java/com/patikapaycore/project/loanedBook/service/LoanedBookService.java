package com.patikapaycore.project.loanedBook.service;

import com.patikapaycore.project.loanedBook.model.dto.LoanedBookResponseDto;
import com.patikapaycore.project.loanedBook.model.dto.entity.LoanedBook;

import java.util.List;

public interface LoanedBookService {

   List<LoanedBook> getAllLoanedBooks();

   LoanedBookResponseDto getByLoanedBookId(Integer id);

   LoanedBook addLoanedBook(LoanedBook loanedBook);


   void updateLoanedBook(LoanedBook loanedBook);

   boolean deleteLoanedBook(Integer id);


}
