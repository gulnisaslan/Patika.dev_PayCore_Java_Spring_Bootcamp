package com.patikapaycore.project.booktype.service;

import com.patikapaycore.project.booktype.model.dto.BookTypeRequestDto;
import com.patikapaycore.project.booktype.model.dto.BookTypeRequestDtoUpdate;
import com.patikapaycore.project.booktype.model.dto.BookTypeResponseDto;
import com.patikapaycore.project.booktype.model.entity.BookType;

import java.util.List;

public interface BookTypeService {

    List<BookTypeResponseDto> getAllBookType();

    BookTypeResponseDto getByBookId(Integer id);
    BookType getByBookId1(Integer id);

    BookTypeResponseDto addBookType(BookTypeRequestDto bookTypeRequestDto);

    void updateBookType(BookTypeRequestDtoUpdate bookTypeRequestDtoUpdate);

    boolean deleteBookType(Integer id);

}


