package br.com.conbook.books.model.dto;

import java.time.LocalDate;

import br.com.conbook.books.model.Book;

public record BookList(String bookName, String author, Long numberOfPages, LocalDate dateOfEnd) {

	public BookList(Book book) {
		this(book.getBookName(), book.getAuthor(), book.getNumbersOfPages(), book.getDateOfEnd());
	}

}
