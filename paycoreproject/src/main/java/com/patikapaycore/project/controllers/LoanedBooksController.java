package com.patikapaycore.project.controllers;

import com.patikapaycore.project.dtos.request.LoanedBookRequestDto;
import com.patikapaycore.project.dtos.response.LoanedBookResponseDto;
import com.patikapaycore.project.models.entities.LoanedBook;
import com.patikapaycore.project.services.abstracts.LoanedBookService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
@RequestMapping("/api/loanedbooks")
public class LoanedBooksController {


    private final LoanedBookService loanedBookService;

    @Autowired
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
    public LoanedBookResponseDto createLoanedBook(@Valid @RequestBody LoanedBookRequestDto loanedBookRequestDto){
        return this.loanedBookService.addLoanedBook(loanedBookRequestDto);
    }

    

    @DeleteMapping(value ="/deleteloanedbook/{id}")
    public boolean deleteLoanedBook(@PathVariable @Min(1) @Param("{id}") Integer id){
        this.loanedBookService.deleteLoanedBook(id);
        return true;
    }
}
