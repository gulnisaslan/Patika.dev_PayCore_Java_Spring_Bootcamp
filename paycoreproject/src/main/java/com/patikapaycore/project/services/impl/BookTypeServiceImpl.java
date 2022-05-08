package com.patikapaycore.project.services.impl;

import com.patikapaycore.project.models.dtos.request.BookTypeRequestDto;
import com.patikapaycore.project.models.entities.BookType;

import com.patikapaycore.project.services.abstracts.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookTypeServiceImpl implements BookTypeService {

    @Autowired
    private  com.patikapaycore.project.repositories.BookTypeRepository bookTypeRepository;

  

    @Override
    public List<BookType> getAllBookType() {

        return this.bookTypeRepository.findAll();
    }

    @Override
    public BookType getByBookId(Integer id) {

        return this.bookTypeRepository.getById(id);
    }

    @Override
    public BookType addBookType(BookTypeRequestDto bookTypeRequestDto) {
      
        return null;
    }

    @Override
    public void updateBookType(BookType bookType) {

        this.bookTypeRepository.save(bookType);
    }

    @Override
    public boolean deleteBookType(Integer id) {

        BookType byId = this.bookTypeRepository.getById(id);
        this.bookTypeRepository.delete(byId);
        return true;
    }


}
