package com.example.demo.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
