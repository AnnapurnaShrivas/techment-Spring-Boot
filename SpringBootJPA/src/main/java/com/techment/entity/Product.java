package com.techment.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product501")
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)    // automatically gererate the value of id
	private int id;
	private String name;
	private String category;
	private int price;
	
	
	
	
	
	public Product() {
		super();
	}
	
	
	
	public Product(String name, String category, int price) {
		super();
		this.name = name;
		category = category;
		this.price = price;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Category=" + category + ", price=" + price + "]";
	}
	
	
	
	
}
