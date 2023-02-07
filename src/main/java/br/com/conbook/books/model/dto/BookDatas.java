package br.com.conbook.books.model.dto;

import java.time.LocalDate;

import br.com.conbook.books.model.Book;

public record BookDatas(Long id, String name, String author, Long numberOfPages, LocalDate dateOfEnd) {
	
	public BookDatas(Book book) {
		this(book.getId(), book.getName(), book.getAuthor(), book.getNumbersOfPages(), book.getDateOfEnd());
	}
}
