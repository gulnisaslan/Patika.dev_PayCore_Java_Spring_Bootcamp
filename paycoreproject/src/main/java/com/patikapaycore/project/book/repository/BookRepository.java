package com.patikapaycore.project.book.repository;


import org.springframework.stereotype.Repository;
import com.patikapaycore.project.book.model.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByWriter_WriterName(String writerName);
}










