package com.patikapaycore.project.booktype.controller;

import com.patikapaycore.project.booktype.model.dto.BookTypeRequestDto;
import com.patikapaycore.project.booktype.model.dto.BookTypeResponseDto;
import com.patikapaycore.project.booktype.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
@RequestMapping( "/api/booktypes")
public class BookTypesController {

    @Autowired
    private  BookTypeService bookTypeService;

    @GetMapping(value ="/getallbooktype")
    public List<BookTypeResponseDto> getAllBookType(){
        return  this.bookTypeService.getAllBookType();
    }
    @GetMapping(value ="/getbybooktypeid/{id}")
    public BookTypeResponseDto getByBookTypeId(@PathVariable @Min(1) @Param("{id}") Integer id){
        return this.bookTypeService.getByBookId(id);

    }

    @PostMapping(value ="/createbooktype")
    public BookTypeResponseDto addBookType(@Valid @RequestBody BookTypeRequestDto bookType){
        return  this.bookTypeService.addBookType(bookType);
    }
   

    @DeleteMapping(value ="/deletebooktype/{id}")
    public boolean deleteBookType(@PathVariable @Min((1)) @Param("{id}") Integer id){
        this.bookTypeService.deleteBookType(id);
        return true;
    }



}

