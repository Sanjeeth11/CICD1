package com.organization.employees.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.organization.employees.entity.Employee;

@Service
public interface EmployeeService {

	Employee addEmployee(Employee employee);

	Optional<Employee> getEmployee(String eId);
}
