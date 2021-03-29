package com.ltts.Book.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.Book.model.Book;  
public interface BookRepository extends CrudRepository<Book, Integer> {

}

