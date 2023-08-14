package com.patikapaycore.project.loanedBook.controller;

import com.patikapaycore.project.loanedBook.model.dto.LoanedBookResponseDto;
import com.patikapaycore.project.loanedBook.model.dto.entity.LoanedBook;
import com.patikapaycore.project.loanedBook.service.LoanedBookService;


import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1.0/loanedbooks")
public class LoanedBooksController {


    private final LoanedBookService loanedBookService;

    public LoanedBooksController(LoanedBookService loanedBookService) {
        this.loanedBookService = loanedBookService;
    }

    @GetMapping(value ="/getallloanedbook")
    public List<LoanedBook> getAllLoanedBooks(){
        return this.loanedBookService.getAllLoanedBooks();
    }


    @GetMapping(value ="getbyloanedid/{id}")
    public LoanedBookResponseDto getById(@PathVariable @Min(1) @Param("{id}") Integer id){
        return this.loanedBookService.getByLoanedBookId(id);
    }

    @PostMapping(value ="/createloanedbook",consumes ={"application/json"})
    public LoanedBook createLoanedBook(@Valid @RequestBody LoanedBook loanedBook){
        return this.loanedBookService.addLoanedBook(loanedBook);
    }

    

    @DeleteMapping(value ="/deleteloanedbook/{id}")
    public boolean deleteLoanedBook(@PathVariable @Min(1) @Param("{id}") Integer id){
        this.loanedBookService.deleteLoanedBook(id);
        return true;
    }
}
