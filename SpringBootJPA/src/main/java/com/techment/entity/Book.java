package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book99")
public class Book {

	private Integer ISBN;
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "authorId")
	private Author author;

	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book() {
		super();
	}

	public Book( String title, double price, Author author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	
	
	
	
}
