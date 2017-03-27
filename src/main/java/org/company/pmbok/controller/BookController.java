package org.company.pmbok.controller;

import java.util.List;

import org.company.pmbok.domain.Book;
import org.company.pmbok.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookRepository _bookRepository;
	
	@CrossOrigin
	@RequestMapping(value = "GetBooks", method = RequestMethod.GET)
	public List<Book> GetBooks(){
		
		return _bookRepository.findAll();
	}
	
}
