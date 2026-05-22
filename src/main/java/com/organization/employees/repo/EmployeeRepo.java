package com.organization.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.employees.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String>{

}
