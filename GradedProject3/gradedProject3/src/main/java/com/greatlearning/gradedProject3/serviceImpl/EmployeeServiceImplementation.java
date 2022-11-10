package com.greatlearning.gradedProject3.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.gradedProject3.entity.Employee;
import com.greatlearning.gradedProject3.repository.EmployeeRepository;
import com.greatlearning.gradedProject3.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {
		return employeeRepository.findById(id);
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return ;
		 
	}
	
	@Override
	public List<Employee> searchByFirstName(String firstName) {
		return employeeRepository.findByFirstNameContainsAllIgnoreCase(firstName); 
	}
	
	@Override
	public List<Employee> sortFirstNameAsc() {
		return employeeRepository.findAllByOrderByFirstNameAsc(); 
	}
	
	@Override
	public List<Employee> sortFirstNameDesc() {
		return employeeRepository.findAllByOrderByFirstNameDesc(); 
	}
}
