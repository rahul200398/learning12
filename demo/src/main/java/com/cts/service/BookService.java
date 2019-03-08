package com.cts.service;

import java.util.List;

import com.entity.Book;

public interface BookService {
	void saveBook(Book book);
	List<Book> listBooks();
	public Book getBook(int id);
	public void deleteBook(int id);

}
