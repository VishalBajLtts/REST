package com.ltts.Book.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Book.model.Book;
import com.ltts.Book.service.BookService;  

//mark class as Controller  
@RestController  
public class BookController   
{  
//autowire the BooksService class  
@Autowired  
BookService bookService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/books")  
private List<Book> getAllBooks()   
{  
return bookService.getAllBooks();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/books/{book_id}")  
private Book getBooks(@PathVariable("book_id") int book_id)   
{  
return bookService.getBooksById(book_id);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/books/{book_id}")  
private void deleteBook(@PathVariable int book_id)   
{  
bookService.delete(book_id);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/books")  
private int saveBook(@RequestBody Book books)   
{  
bookService.saveOrUpdate(books);  
return books.getBook_id();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/books")  
private Book update(@RequestBody Book books)   
{  
bookService.saveOrUpdate(books);  
return books;  
}  
}  
