package br.com.conbook.books.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.conbook.books.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	Optional<Book> findByAuthor(String name);

}
