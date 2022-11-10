package com.greatlearning.gradedProject3.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.gradedProject3.entity.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();
	Employee saveEmployee(Employee employee);
	Optional<Employee> findEmployeeById(int id);
	void deleteEmployee(int id);
	List<Employee> searchByFirstName(String firstName);
	List<Employee> sortFirstNameAsc();
	List<Employee> sortFirstNameDesc();

}
