package com.patikapaycore.project.book.service;

import com.patikapaycore.project.book.model.dto.BookRequestDto;
import com.patikapaycore.project.book.model.dto.BookRequestDtoUpdate;
import com.patikapaycore.project.book.model.dto.BookResponseDto;
import com.patikapaycore.project.book.model.entity.Book;
import com.patikapaycore.project.booktype.model.entity.BookType;
import com.patikapaycore.project.writer.model.entity.Writer;
import com.patikapaycore.project.book.repository.BookRepository;

import com.patikapaycore.project.booktype.service.BookTypeService;
import com.patikapaycore.project.writer.service.WriterService;
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
    public Book getByBookId1(Integer id) {
        
        return this.bookRepository.getById(id);
    }

    @Override
    public BookResponseDto updateBook(BookRequestDtoUpdate bookRequestDtoUpdate) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public List<BookResponseDto> findByWriterWriterName(String writerName) {
      List<Book> byWriterwriterName = bookRepository.findByWriter_WriterName(writerName);
        return byWriterwriterName.stream()
                .map(book -> modelMapper.map(book, BookResponseDto.class)).collect(Collectors.toList());
    }
}

