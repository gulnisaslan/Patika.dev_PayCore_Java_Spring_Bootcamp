package com.patikapaycore.project.controllers;


import com.patikapaycore.project.dtos.request.BookRequestDto;
import com.patikapaycore.project.dtos.response.BookResponseDto;
import com.patikapaycore.project.models.entities.Book;
import com.patikapaycore.project.services.abstracts.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;


@Validated

@RestController
@RequestMapping("/api/books")
public class BooksController {


    private final BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping(value ="/getallbooks")
   public List<BookResponseDto> getAllBooks(){
      return this.bookService.getAllBooks();
    }



   @GetMapping (value ="/getbybookid/{id}")
   public Book getByBookId(@PathVariable @Min(1) @Param("{id}") Integer id){
       return null;// this.bookService.getByBookId(id);
   }

   @PostMapping(value = "/addBook")
   public BookResponseDto addBook(@Valid @RequestBody BookRequestDto bookRequestDto){
        return  this.bookService.addBook(bookRequestDto);
   }

    @PutMapping(value ="/updatebook",consumes ={"application/json"})
    public void updateBook(@Valid @RequestBody Book book){
      // this.bookService.updateBook(book);

    }
    @DeleteMapping(value ="/deletebook/{id}")
    public boolean deleteBook(@PathVariable @Min(1) @Param("{id}") Integer id){
       this.bookService.deleteBook(id);
       return true;
    }

    @GetMapping(value="/getByWriterName/{writerName}")
    public List<BookResponseDto> getByWriterName(@RequestBody @Param("{writerName}") String writerName){

        return bookService.findByWriter_WriterName(writerName);
    }
//    @GetMapping(value="/getByWriterName/{writerName}")
//    public List<BookResponseDto> getByBookId(@RequestBody @Param("{writerName}") String writerName){
//
//        return bookService.findByWriter_WriterName(writerName);
//    }



}
