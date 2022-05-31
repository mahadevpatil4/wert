package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee employee) {
		return employeeService.saveEmp(employee);

	}
	@GetMapping("/{id}")
	public Employee findEmployeeById(@PathVariable("id") int empId) {
		return employeeService.findEmployeeById(empId);
	}


}
