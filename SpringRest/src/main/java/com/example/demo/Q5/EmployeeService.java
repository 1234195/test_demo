package com.example.demo.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employee = new ArrayList<>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}

	public Optional<Employee> getEmployee(String Id) {
		return employeeRepository.findById(Id);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String Id,Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String Id) {
		employeeRepository.deleteById(Id);
	}
}
