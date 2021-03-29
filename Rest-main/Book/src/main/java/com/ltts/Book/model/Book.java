package com.ltts.Book.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
    private int  book_id;
	@Column
    private String book_name;
	
	public Book() {
		super();
	} 
	
	public Book(int book_id, String book_name) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
	}
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	@Override
	public String toString() {
		return "Library [book_id=" + book_id + ", book_name=" + book_name + "]";
	}
	
	
	
	
}
