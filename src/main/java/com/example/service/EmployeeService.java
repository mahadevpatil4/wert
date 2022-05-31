package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRespo;

@Service
public class EmployeeService {
@Autowired
	EmployeeRespo employeeRespo;
	
public Employee saveEmp(Employee employee) {
	return employeeRespo.save(employee);
	
}

public Employee findEmployeeById(int empId) {
	return employeeRespo.findByempId(empId);
}


}
