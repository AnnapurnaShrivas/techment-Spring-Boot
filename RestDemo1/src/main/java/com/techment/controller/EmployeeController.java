package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeController() {
		super();
		
	employees.add(new Employee(1,"sachin","hr"));
		employees.add(new Employee(2,"Annapurna","Developer"));
	}

	
	@GetMapping(value ="/showMessage")
	public String display()
	{
		return "This is my 1st REST DEMO page";
	}
	
	
	
	@GetMapping(value ="/showEmployee")
	public ArrayList<Employee> showEmployee()
	{
		
		
		return employees;
	}
	
	//@RequestMapping(method = RequestMethod.POST)
	//OR
	@PostMapping(value = "/addNEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDept());
		employees.add(employee);
		return "Employee added";
	}
	
	}

