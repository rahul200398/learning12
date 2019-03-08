package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.BookDAO;
import com.entity.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	@Transactional
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("Save from service");
		bookDAO.saveBook(book);
	}

	@Override
	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		return bookDAO.listAllBook();
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
