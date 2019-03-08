package com.cts.dao;

import java.util.List;

import com.entity.Book;

public interface BookDAO  {
	public void saveBook(Book book);
	public List<Book> listAllBook();
	

}
