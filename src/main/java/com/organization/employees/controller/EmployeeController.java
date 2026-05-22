package com.organization.employees.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organization.employees.entity.Employee;
import com.organization.employees.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		Employee addedEmployee = employeeService.addEmployee(employee);

		return new ResponseEntity<Employee>(addedEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/get/employee/{eId}")
	public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable String eId) {

		Optional<Employee> addedEmployee = employeeService.getEmployee(eId);
		return new ResponseEntity<Optional<Employee>>(addedEmployee, HttpStatus.CREATED);

	}

}
