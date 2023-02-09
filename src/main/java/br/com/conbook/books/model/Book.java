package br.com.conbook.books.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String author;
	private Long numbersOfPages;
	private LocalDateTime dateOfEnd;

	public Book() {

	}

	public Book(String name, String author, Long numbersOfPages, LocalDateTime dateOfEnd) {
		this.name = name;
		this.author = author;
		this.numbersOfPages = numbersOfPages;
		this.dateOfEnd = dateOfEnd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAutor(String author) {
		this.author = author;
	}

	public Long getNumbersOfPages() {
		return numbersOfPages;
	}

	public void setNumbersOfPages(Long numbersOfPages) {
		this.numbersOfPages = numbersOfPages;
	}

	public LocalDateTime getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(LocalDateTime dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name +", author=" + author + ", numbersOfPages=" + numbersOfPages + ", dateOfEnd=" + dateOfEnd
				+ "]";
	}

}
