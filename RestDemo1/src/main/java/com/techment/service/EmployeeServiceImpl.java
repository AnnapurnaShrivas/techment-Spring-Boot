package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.EmployeeDao;
import com.techment.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeservice {

	@Autowired
	EmployeeDao employeeDao;
	
	
	@Override
	public String addEmployee(Employee employee) {
	
		employeeDao.save(employee);
		return "Employee Added";
	}

	@Override
	public List<Employee> viewAllEmployees() {
		
		return employeeDao.findAll();
	}

	
	
	//getById or findById 
	@Override
	public Employee viewEmployeeById(int id) {
		
		return employeeDao.findById(id).get();
	}

}
