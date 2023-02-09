package br.com.conbook.books.model.dto;

import java.time.LocalDateTime;

import br.com.conbook.books.model.Book;

public record BookDatas(Long id, String name, String author, Long numberOfPages, LocalDateTime dateOfEnd) {
	
	public BookDatas(Book book) {
		this(book.getId(), book.getName(), book.getAuthor(), book.getNumbersOfPages(), book.getDateOfEnd());
	}
}
