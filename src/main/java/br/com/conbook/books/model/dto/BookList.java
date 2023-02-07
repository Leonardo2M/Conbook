package br.com.conbook.books.model.dto;

import java.time.LocalDate;

import br.com.conbook.books.model.Book;

public record BookList(String name, String author, Long numberOfPages, LocalDate dateOfEnd) {

	public BookList(Book book) {
		this(book.getName() ,book.getAuthor(), book.getNumbersOfPages(), book.getDateOfEnd());
	}

}
