package com.patikapaycore.project.booktype.repository;

import com.patikapaycore.project.booktype.model.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTypeRepository extends JpaRepository<BookType,Integer> {
}
