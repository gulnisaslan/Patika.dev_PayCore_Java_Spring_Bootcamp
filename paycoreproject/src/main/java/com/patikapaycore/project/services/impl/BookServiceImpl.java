package com.patikapaycore.project.services.impl;

import com.patikapaycore.project.dtos.request.BookRequestDto;
import com.patikapaycore.project.dtos.response.BookResponseDto;
import com.patikapaycore.project.dtos.response.BookTypeResponseDto;
import com.patikapaycore.project.dtos.response.WriterResponseDto;
import com.patikapaycore.project.models.entities.Book;
import com.patikapaycore.project.models.entities.BookType;
import com.patikapaycore.project.models.entities.Writer;
import com.patikapaycore.project.repositories.BookRepository;
import com.patikapaycore.project.services.abstracts.BookService;

import com.patikapaycore.project.services.abstracts.BookTypeService;
import com.patikapaycore.project.services.abstracts.WriterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@Service

public class BookServiceImpl implements BookService {

    private  final BookRepository bookRepository;
    private  final WriterService writerService;
    private  final BookTypeService bookTypeService;
    private final ModelMapper modelMapper;


    public BookServiceImpl(BookRepository bookRepository, WriterService writerService, BookTypeService bookTypeService, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.writerService = writerService;
        this.bookTypeService = bookTypeService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BookResponseDto> getAllBooks() {

        List<Book> getallBooksResponse = this.bookRepository.findAll();

        return getallBooksResponse.stream()
                .map(book -> modelMapper.map(book, BookResponseDto.class)).collect(Collectors.toList());
    }
    @Override
    public boolean deleteBook(Integer id) {

            Book byId = this.bookRepository.getById(id);
            this.bookRepository.delete(byId);
            return true;
    }


    @Override
    public List<BookResponseDto> findByWriter_WriterName(String writerName) {
        List<Book> byWriter_writerName = bookRepository.findByWriter_WriterName(writerName);
        return byWriter_writerName.stream()
                .map(book -> modelMapper.map(book, BookResponseDto.class)).collect(Collectors.toList());
    }


    /* (non-Javadoc)
     * @see com.patikapaycore.project.services.abstracts.BookService#getByBookId(java.lang.Integer)
     */
    @Override
    public BookResponseDto getByBookId(Integer id) {
        Book book = this.bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id + " id numaralı kitap bulumamadı"));
        return modelMapper.map(book,BookResponseDto.class);
    }

    @Override
    public BookResponseDto addBook(BookRequestDto bookRequestDto) {
        BookType byBookId = this.bookTypeService.getByBookId1(bookRequestDto.getBookTypeId());
        Writer byWriterId1 = writerService.getByWriterId1(bookRequestDto.getWriterId());
        Book build = Book.builder()
                .bookType(byBookId)
                .writer(byWriterId1)
                .bookName(bookRequestDto.getBookName())
                .isbnNo(bookRequestDto.getIsbnNo())
                .bookDescription(bookRequestDto.getBookDescription())
                .build();

        Book save = this.bookRepository.save(build);
        return modelMapper.map(save,BookResponseDto.class);


    }


    // ToDo: Update method was refactoring
    @Override
    public void updateBook(BookRequestDto bookRequestDto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Book getByBookId1(Integer id) {
        // TODO Auto-generated method stub
        return this.bookRepository.getById(id);
    }
}

