package br.com.conbook.books.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.conbook.books.model.dto.BookDatas;
import br.com.conbook.books.model.dto.BookList;
import br.com.conbook.books.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookService service;

	public BookController(BookService service) {
		this.service = service;
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
