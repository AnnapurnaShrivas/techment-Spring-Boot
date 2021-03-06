package com.techment.entity;

import javax.persistence.*;

@Entity
@Table(name ="employee01")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String dept;
	
	
	
	
	public Employee() {
		super();
	}




	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	

}
