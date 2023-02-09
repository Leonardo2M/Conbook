package br.com.conbook.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.conbook.books.model.Book;
import br.com.conbook.books.model.dto.BookDatas;
import br.com.conbook.books.model.dto.BookList;
import br.com.conbook.books.model.dto.UpdateDataBook;
import br.com.conbook.books.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository repository;

	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	
	
	// Insert new entity (POST)
	public ResponseEntity<BookDatas> save(Book book, UriComponentsBuilder uriBuilder) {
		repository.save(book);
		
		var uri = uriBuilder.path("/books/{id}").buildAndExpand(book.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new BookDatas(book));
	}
	
	// Read all entity (GET)
	public ResponseEntity<List<BookList>> findAll() {
		List<BookList> books = repository.findAll().stream().map(BookList::new).toList();

		return ResponseEntity.ok().body(books);
	}

	// Read all entity by author (GET)
	public ResponseEntity<List<BookList>> findAllByAuthor(String name) {
		List<BookList> books = repository.findAllByAuthor(name).stream().map(BookList::new).toList();
		
		if(books.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok().body(books);
	}
	
	
	// Find one entity by id (GET)
	public ResponseEntity<Optional<BookDatas>> findById(Long id) {
		Optional<BookDatas> book = repository.findById(id).map(BookDatas::new);

		if (book.isPresent()) {
			return ResponseEntity.ok().body(book);
		}

		return ResponseEntity.notFound().build();
	}
	
	// Update book for id (PUT)
	public ResponseEntity<BookDatas> update(Long id, UpdateDataBook data){
		Book book = repository.getReferenceById(id);
		
		if (book == null) {
			return ResponseEntity.notFound().build();
		}
		
		book.updateData(data);
		repository.save(book);
		
		return ResponseEntity.ok().body(new BookDatas(book));
	}
	
	// Delete book for id (DELETE)
	public ResponseEntity<?> delete(Long id) {
		Book book = repository.getReferenceById(id);
		
		if (book == null) {
			return ResponseEntity.notFound().build();
		}
		
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
