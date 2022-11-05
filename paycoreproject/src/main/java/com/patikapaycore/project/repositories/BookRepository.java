package com.patikapaycore.project.repositories;


import org.springframework.stereotype.Repository;
import com.patikapaycore.project.models.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByWriter_WriterName(String writerName);
}










