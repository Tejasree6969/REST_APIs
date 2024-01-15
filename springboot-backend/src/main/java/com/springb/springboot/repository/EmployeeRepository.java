package com.springb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springb.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
 
	
}
