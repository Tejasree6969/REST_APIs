package com.springb.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springb.springboot.exception.ResourceNotFoundException;
import com.springb.springboot.model.Employee;
import com.springb.springboot.repository.EmployeeRepository;
import com.springb.springboot.service.EmployeeService;
      

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
private EmployeeRepository employeeRepository;

/**
 * @param employeeRepository
 */
public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}

@Override  
public Employee saveEmployee(Employee employee) {
	return employeeRepository.save(employee);
}

@Override
public List<Employee> getAllemployees() {
	
	return employeeRepository.findAll();
}

@Override
public Employee getEmployeeById(long id) {
	Optional<Employee> employee = employeeRepository.findById(id);
	if(employee.isPresent()) {
		return employee.get();
		}
	else{
		throw new ResourceNotFoundException("Employee","Id",id);
		}
	}

@Override
public Employee updateEmployee(Employee employee, long id) {
	
	Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()
			-> new ResourceNotFoundException("Employee","ID",id));
	
	existingEmployee.setFirstName(employee.getFirstName());
	existingEmployee.setLastName(employee.getLastName());
	existingEmployee.setEmail(employee.getEmail());
	
	employeeRepository.save(existingEmployee);
	return existingEmployee;
}

@Override
public void deleteEmployee(long id) {

	 employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","Id",id));
	 
	 employeeRepository.deleteById(id);
	
}


}




