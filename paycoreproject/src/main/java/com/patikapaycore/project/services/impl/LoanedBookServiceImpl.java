package com.patikapaycore.project.services.impl;

import com.patikapaycore.project.dtos.request.LoanedBookRequestDto;
import com.patikapaycore.project.dtos.response.BookResponseDto;
import com.patikapaycore.project.dtos.response.LoanedBookResponseDto;
import com.patikapaycore.project.dtos.response.UserResponseDto;
import com.patikapaycore.project.exception.LoanedBookUserException;
import com.patikapaycore.project.models.entities.Book;
import com.patikapaycore.project.models.entities.LoanedBook;
import com.patikapaycore.project.models.entities.User;
import com.patikapaycore.project.services.abstracts.BookService;
import com.patikapaycore.project.services.abstracts.LoanedBookService;
import com.patikapaycore.project.services.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LoanedBookServiceImpl implements LoanedBookService {
    private final com.patikapaycore.project.repositories.LoanedBookRepository loanedBookRepository;
    private final BookService bookService;
    private  final UserService userService;
    
    @Autowired
    public LoanedBookServiceImpl(com.patikapaycore.project.repositories.LoanedBookRepository loanedBookRepository, BookService bookService, UserService userService) {
        this.loanedBookRepository = loanedBookRepository;
        this.bookService = bookService;
        this.userService = userService;
    }

    @Override
    public List<LoanedBook> getAllLoanedBooks() {
        List<LoanedBook> all = this.loanedBookRepository.findAll();
        return all;

    }

    @Override
    public LoanedBookResponseDto getByLoanedBookId(Integer id) {
        LoanedBook byId = this.loanedBookRepository.getById(id);
        return  loanedBookResponseDto(byId) ;
    }

    @Override
    public LoanedBookResponseDto addLoanedBook(LoanedBookRequestDto loanedBookRequestDto) {

        Book byBookId1 = this.bookService.getByBookId1(loanedBookRequestDto.getBookId());
    User byUserId = this.userService.getByUserId1(loanedBookRequestDto.getUserId());



        LoanedBook build = LoanedBook.builder()
                .id(UUID.randomUUID().toString())
                .books(byBookId1)
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
        User user = new User();
        Book book = new Book();
        return LoanedBookResponseDto.builder()
                .bookName(loanedBook.getBooks().getBookName())
                .userFullName(user.getFirstname()+" "+user.getSurname())
                .bookName(book.getBookName())
                .loanedDate(loanedBook.getLoanedDate())
                .loanedDate(loanedBook.getReturnDate())
                .build();
    }

}

