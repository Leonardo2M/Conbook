package br.com.conbook.books.model.exception;

public class BookNotFound extends RuntimeException{

    public BookNotFound(Long id) {
        super("Book with id = " + id +" not found.");
    }
}
