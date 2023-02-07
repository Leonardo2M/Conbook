package br.com.conbook.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.conbook.books.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	List<Book> findAllByAuthor(String name);

}
