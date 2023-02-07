package br.com.conbook.books.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.conbook.books.model.dto.BookList;
import br.com.conbook.books.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository repository;
	
	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	
	public ResponseEntity<List<BookList>> findAll(){
		List<BookList> books = repository.findAll().stream().map(BookList::new).toList();
		
		return ResponseEntity.ok().body(books);
	}
}
