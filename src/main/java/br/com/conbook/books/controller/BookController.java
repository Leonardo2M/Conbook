package br.com.conbook.books.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.conbook.books.model.Book;
import br.com.conbook.books.model.dto.BookDatas;
import br.com.conbook.books.model.dto.BookList;
import br.com.conbook.books.model.dto.BooksInsert;
import br.com.conbook.books.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookService service;

	public BookController(BookService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<BookDatas> insert(@RequestBody BooksInsert data, UriComponentsBuilder uriBuilder) {
			
		Book book = data.converter();
		return service.save(book, uriBuilder);
		
	}

	@GetMapping
	public ResponseEntity<List<BookList>> findAll(@RequestParam(required = false) String author) {
		if (author == null) {
			return service.findAll();

		}

		return service.findAllByAuthor(author);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<BookDatas>> findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
