package com.patikapaycore.project.configs.modelmapper;

import com.patikapaycore.project.dtos.request.BookRequestDto;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.patikapaycore.project.dtos.response.BookResponseDto;
import com.patikapaycore.project.models.entities.Book;

@Configuration
public class ModelMapperConfig {
//    public static final   Converter<Book,BookResponseDto>
//    BOOK_RESPONSE_DTO_CONVERTER=(context)->{
//        Book book= context.getSource();
//        BookResponseDto bookResponseDto = new BookResponseDto();
//
//        bookResponseDto.setBookTypeName(book.getBookType().getTypeName());
//        bookResponseDto.setWriterFullName(book.getWriter().getWriterName()+" "+book.getWriter().getWriterSurname());
//        bookResponseDto.setBookName(book.getBookName());
//        bookResponseDto.setBookDescription(book.getBookDescription());
//        bookResponseDto.setIsbnNo(book.getIsbnNo());
//
//        return bookResponseDto;
   // };







    @Bean
    public ModelMapper modelMapper(){
        ModelMapper mapper  = new ModelMapper();
       // mapper.addConverter(BOOK_RESPONSE_DTO_CONVERTER,  Book.class,BookResponseDto.class);
        return mapper;
    }
}
