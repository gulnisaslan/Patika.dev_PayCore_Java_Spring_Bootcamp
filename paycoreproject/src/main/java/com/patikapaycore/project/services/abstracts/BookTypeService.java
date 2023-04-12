package com.patikapaycore.project.services.abstracts;

import com.patikapaycore.project.dtos.request.BookTypeRequestDto;
import com.patikapaycore.project.dtos.request.BookTypeRequestDtoUpdate;
import com.patikapaycore.project.dtos.response.BookTypeResponseDto;
import com.patikapaycore.project.models.entities.BookType;

import java.util.List;

public interface BookTypeService {

    List<BookTypeResponseDto> getAllBookType();

    BookTypeResponseDto getByBookId(Integer id);
    BookType getByBookId1(Integer id);

    BookTypeResponseDto addBookType(BookTypeRequestDto bookTypeRequestDto);

    void updateBookType(BookTypeRequestDtoUpdate bookTypeRequestDtoUpdate);

    boolean deleteBookType(Integer id);

}


