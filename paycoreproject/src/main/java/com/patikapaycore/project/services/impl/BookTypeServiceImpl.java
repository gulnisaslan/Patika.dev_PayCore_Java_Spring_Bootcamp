package com.patikapaycore.project.services.impl;

import com.patikapaycore.project.dtos.request.BookTypeRequestDto;
import com.patikapaycore.project.dtos.response.BookTypeResponseDto;
import com.patikapaycore.project.models.entities.BookType;

import com.patikapaycore.project.repositories.BookTypeRepository;
import com.patikapaycore.project.services.abstracts.BookTypeService;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class BookTypeServiceImpl implements BookTypeService {

    private final com.patikapaycore.project.repositories.BookTypeRepository bookTypeRepository;
    private final ModelMapper modelMapper;

    public BookTypeServiceImpl(BookTypeRepository bookTypeRepository, ModelMapper modelMapper) {
        this.bookTypeRepository = bookTypeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BookTypeResponseDto> getAllBookType() {
        List<BookType> getAll = this.bookTypeRepository.findAll();
        return getAll.stream()
                .map(writer->modelMapper.map(writer,BookTypeResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public BookTypeResponseDto getByBookId(Integer id) {
        BookType getbyId = this.bookTypeRepository.getById(id);
        return modelMapper.map(getbyId,BookTypeResponseDto.class);
    }

    @Override
    public BookType getByBookId1(Integer id) {
        return this.bookTypeRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
    }

    @Override
    public BookTypeResponseDto addBookType(BookTypeRequestDto bookTypeRequestDto) {
        BookType booktype = this.bookTypeRepository.save(modelMapper.map(bookTypeRequestDto, BookType.class));
        return modelMapper.map(booktype,BookTypeResponseDto.class);
    }
    // ToDo: Update method was refactoring
    @Override
    public void updateBookType(BookTypeRequestDto bookTypeRequestDto) {
        this.bookTypeRepository.save(null);
    }



    @Override
    public boolean deleteBookType(Integer id) {

        BookType byId = this.bookTypeRepository.getById(id);
        this.bookTypeRepository.delete(byId);
        return true;
    }


}
