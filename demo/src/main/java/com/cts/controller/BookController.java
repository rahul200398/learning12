package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.service.BookService;
import com.entity.Book;

@Controller
@RequestMapping("/book")
public class BookController {
    
	@Autowired
	BookService bookService;
	
	@GetMapping("/list")
	public String listAllBook(Model model) {
     System.out.println("Entered in Bosks");
     List<Book> ls=bookService.listBooks();
     System.out.println("Booklist"+ls);
		model.addAttribute("books",ls);
		return "booklist";
	}
}
