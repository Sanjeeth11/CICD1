package com.organization.employees.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.employees.entity.Employee;
import com.organization.employees.repo.EmployeeRepo;
import com.organization.employees.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee e = employeeRepo.save(employee);
		return e;
	}

	@Override
	public Optional<Employee> getEmployee(String eId) {
		Optional<Employee> e = employeeRepo.findById(eId);
		return e;
	}
}
