package br.com.conbook.books.model.dto;

import java.time.LocalDateTime;

public record UpdateDataBook(String name, String author, LocalDateTime dateOfEnd, Long numberOfPages) {

}
