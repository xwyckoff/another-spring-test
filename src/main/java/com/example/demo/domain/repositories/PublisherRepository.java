package com.example.demo.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
