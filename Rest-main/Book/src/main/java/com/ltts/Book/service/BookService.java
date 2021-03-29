package com.ltts.Book.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.ltts.Book.model.Book;
import com.ltts.Book.repository.BookRepository;  

//defining the business logic  
@Service  
public class BookService   
{  
@Autowired  
BookRepository bookRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Book> getAllBooks()   
{  
List<Book> book = new ArrayList<Book>();  
bookRepository.findAll().forEach(book1 -> book.add(book1));  
return book;  
}  

public Book getBooksById(int id)   
{  
return bookRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Book book)   
{  
bookRepository.save(book);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	bookRepository.deleteById(id);  
}  
//updating a record  
public void update(Book book, int book_id)   
{  
bookRepository.save(book);  
}
} 