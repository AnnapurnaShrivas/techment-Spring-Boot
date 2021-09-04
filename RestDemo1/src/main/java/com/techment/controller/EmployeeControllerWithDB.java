package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;
import com.techment.service.IEmployeeservice;

@RestController
@RequestMapping(value = "/employeeControllerDB")
public class EmployeeControllerWithDB {

	@Autowired
	IEmployeeservice iEmployeeservice;
	
	@GetMapping(value = "/viewAllEmployee")
	public List<Employee> viewAllEmployee() {
		return iEmployeeservice.viewAllEmployees();
	}
	
	@PostMapping(value ="/addNewEmployee")
	public String addNewEmployee(@RequestBody Employee employee)
	{
		return iEmployeeservice.addEmployee(employee);
	}
	
	@GetMapping(value = "/viewEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return iEmployeeservice.viewEmployeeById(id);
	}
	
}
