package com.patikapaycore.project.services.abstracts;

import com.patikapaycore.project.dtos.request.BookRequestDto;
import com.patikapaycore.project.dtos.request.BookRequestDtoUpdate;
import com.patikapaycore.project.dtos.response.BookResponseDto;
import com.patikapaycore.project.models.entities.Book;


import java.util.List;

public interface BookService {
    List<BookResponseDto> getAllBooks();

    BookResponseDto getByBookId(Integer id);
    Book getByBookId1(Integer id);

    BookResponseDto addBook(BookRequestDto bookRequestDto);

    BookResponseDto updateBook(BookRequestDtoUpdate bookRequestDtoUpdate);

    boolean deleteBook(Integer id);

    List<BookResponseDto> findByWriterWriterName(String writerName);

}
