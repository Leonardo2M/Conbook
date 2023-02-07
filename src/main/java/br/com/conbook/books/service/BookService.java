package br.com.conbook.books.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.conbook.books.model.Book;
import br.com.conbook.books.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository repository;
	
	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	
	public ResponseEntity<List<Book>> findAll(){
		List<Book> books = repository.findAll();
		
		return ResponseEntity.ok().body(books);
	}
}
