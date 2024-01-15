package com.springb.springboot.service;

import java.util.List;

import com.springb.springboot.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);	
	
	List<Employee> getAllemployees();
	
	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
	}

