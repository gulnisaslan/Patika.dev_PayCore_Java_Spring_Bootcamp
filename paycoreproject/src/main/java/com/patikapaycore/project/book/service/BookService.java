package com.patikapaycore.project.book.service;

import com.patikapaycore.project.book.model.dto.BookRequestDto;
import com.patikapaycore.project.book.model.dto.BookRequestDtoUpdate;
import com.patikapaycore.project.book.model.dto.BookResponseDto;
import com.patikapaycore.project.book.model.entity.Book;


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
