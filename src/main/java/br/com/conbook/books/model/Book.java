package br.com.conbook.books.model;

import java.time.LocalDate;

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
	private String bookName;
	private String author;
	private Long numbersOfPages;
	private LocalDate dateOfEnd;

	public Book() {

	}

	public Book(Long id, String bookName, String author, Long numbersOfPages, LocalDate dateOfEnd) {
		this.id = id;
		this.bookName = bookName;
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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	public LocalDate getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(LocalDate dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", numbersOfPages=" + numbersOfPages + ", dateOfEnd=" + dateOfEnd
				+ "]";
	}

}
