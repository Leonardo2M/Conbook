package br.com.conbook.books.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.conbook.books.model.Book;
import br.com.conbook.books.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private final BookService service;
	
	public BookController(BookService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		return service.findAll();
	}
	
}
