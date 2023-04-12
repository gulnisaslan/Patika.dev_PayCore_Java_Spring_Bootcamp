package com.patikapaycore.project.services.impl;

import com.patikapaycore.project.dtos.request.LoanedBookRequestDto;
import com.patikapaycore.project.dtos.response.LoanedBookResponseDto;
import com.patikapaycore.project.models.entities.LoanedBook;
import com.patikapaycore.project.models.entities.User;
import com.patikapaycore.project.repositories.LoanedBookRepository;
import com.patikapaycore.project.services.abstracts.LoanedBookService;
import com.patikapaycore.project.services.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class LoanedBookServiceImpl implements LoanedBookService {
    private final LoanedBookRepository loanedBookRepository;
    
    private  final UserService userService;
    
    @Autowired
    public LoanedBookServiceImpl(LoanedBookRepository loanedBookRepository, UserService userService) {
        this.loanedBookRepository = loanedBookRepository;
        this.userService = userService;
    }

    @Override
    public List<LoanedBook> getAllLoanedBooks() {
        return this.loanedBookRepository.findAll();

    }

    @Override
    public LoanedBookResponseDto getByLoanedBookId(Integer id) {
        LoanedBook byId = this.loanedBookRepository.getById(id);
        return  loanedBookResponseDto(byId) ;
    }

    @Override
    public LoanedBookResponseDto addLoanedBook(LoanedBookRequestDto loanedBookRequestDto) {

       
        User byUserId = this.userService.getByUserId1(loanedBookRequestDto.getUserId());
        


        LoanedBook build = LoanedBook.builder()
               
                .user(byUserId)
                .loanedDate(LocalDate.now())
                .returnDate(LocalDate.now().plusDays(30))

        .build();
        LoanedBook save = this.loanedBookRepository.save(build);
        return  loanedBookResponseDto(save);
      





    }

    // ToDo: Update method was refactoring
    @Override
    public void updateLoanedBook(LoanedBook loanedBook) {
        this.loanedBookRepository.save(loanedBook);
    }

    @Override
    public boolean deleteLoanedBook(Integer id) {
        LoanedBook byId = this.loanedBookRepository.getById(id);
      this.loanedBookRepository.delete(byId);
      return true;
    }
    
    public  LoanedBookResponseDto loanedBookResponseDto(LoanedBook loanedBook){
        
        return LoanedBookResponseDto.builder()
                .userFullName(loanedBook.getUser().getFirstname()+" "+loanedBook.getUser().getSurname())
                .loanedDate(loanedBook.getLoanedDate())
                .loanedDate(loanedBook.getReturnDate())
                .build();
    }

}

