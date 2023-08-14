package com.patikapaycore.project.booktype.service;

import com.patikapaycore.project.booktype.model.dto.BookTypeRequestDto;
import com.patikapaycore.project.booktype.model.dto.BookTypeRequestDtoUpdate;
import com.patikapaycore.project.booktype.model.dto.BookTypeResponseDto;
import com.patikapaycore.project.booktype.model.entity.BookType;

import com.patikapaycore.project.booktype.repository.BookTypeRepository;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class BookTypeServiceImpl implements BookTypeService {

    private final BookTypeRepository bookTypeRepository;
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
        return this.bookTypeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public BookTypeResponseDto addBookType(BookTypeRequestDto bookTypeRequestDto) {
        BookType booktype = this.bookTypeRepository.save(modelMapper.map(bookTypeRequestDto, BookType.class));
        return modelMapper.map(booktype,BookTypeResponseDto.class);
    }
   
    @Override
    public boolean deleteBookType(Integer id) {

        BookType byId = this.bookTypeRepository.getById(id);
        this.bookTypeRepository.delete(byId);
        return true;
    }

    @Override
    public void updateBookType(BookTypeRequestDtoUpdate bookTypeRequestDtoUpdate) {
        BookType bookType = this.bookTypeRepository.getById(bookTypeRequestDtoUpdate.getId());
        
      bookType.setTypeName(bookTypeRequestDtoUpdate.getTypeName()==null?bookType.getTypeName():bookTypeRequestDtoUpdate.getTypeName());

        this.bookTypeRepository.save(bookType);

    }

    

}



