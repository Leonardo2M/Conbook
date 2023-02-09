package br.com.conbook.books.model;

import java.time.LocalDateTime;

import br.com.conbook.books.model.dto.UpdateDataBook;
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
	private Long numberOfPages;
	private LocalDateTime dateOfEnd;

	public Book() {

	}

	public Book(String name, String author, Long numberOfPages, LocalDateTime dateOfEnd) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
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

	public Long getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Long numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public LocalDateTime getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(LocalDateTime dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", numberOfPages=" + numberOfPages
				+ ", dateOfEnd=" + dateOfEnd + "]";
	}

	public void updateData(UpdateDataBook data) {

		if (data.name() != null) {
			this.name = data.name();
		}

		if (data.author() != null) {
			this.author = data.author();
		}

		if (data.dateOfEnd() != null) {
			this.dateOfEnd = data.dateOfEnd();
		}

		if (data.numberOfPages() != null) {
			this.numberOfPages = data.numberOfPages();
		}

	}

}
