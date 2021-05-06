package com.das.readinglist.repository;

import java.util.List;

import com.das.readinglist.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}