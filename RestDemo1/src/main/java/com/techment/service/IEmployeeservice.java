package com.techment.service;

import java.util.List;


import com.techment.entity.Employee;

public interface IEmployeeservice {


	String addEmployee(Employee employee);
	List<Employee> viewAllEmployees();
	Employee viewEmployeeById(int id);
	
}
