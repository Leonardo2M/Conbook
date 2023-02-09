package br.com.conbook.books.model.dto;

import java.time.LocalDateTime;

import br.com.conbook.books.model.Book;

public record BooksInsert(String name, String author, Long numbersOfPages, LocalDateTime dateOfEnd) {
	
	public Book converter() {
		return new Book(name, author, numbersOfPages, dateOfEnd);
	}
	
}
