package br.com.conbook.books.model.exception;

public class NoBookFound extends RuntimeException{

    public NoBookFound(String message) {
        super(message);
    }
}
