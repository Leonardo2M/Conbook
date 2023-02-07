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
	private String autor;
	private Long numbersOfPages;
	private LocalDate dateOfEnd;

	public Book() {

	}

	public Book(Long id, String autor, Long numbersOfPages, LocalDate dateOfEnd) {
		this.id = id;
		this.autor = autor;
		this.numbersOfPages = numbersOfPages;
		this.dateOfEnd = dateOfEnd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
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
		return "Book [id=" + id + ", autor=" + autor + ", numbersOfPages=" + numbersOfPages + ", dateOfEnd=" + dateOfEnd
				+ "]";
	}
	
}
