package com.example.EmployeeList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeRepository employeeRepository;
	
	public EmployeeController (EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@GetMapping
	public List<Employee>getAllEmployees(){
		return employeeRepository.findAll();
		}

}
