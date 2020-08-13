package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EmployeeRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/api/vi/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	// get employees 
	
	@GetMapping("employees")
	public List<Employee > getAllEmployee(){
		return this.employeeRepository.findAll();
	}
	
	
	
	// get employee by id
	
	
	
    // save employee
	// update employee
	// delete employee

}
