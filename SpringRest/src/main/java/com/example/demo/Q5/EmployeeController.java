package com.example.demo.Q5;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/employees/{Id}")
	public Optional<Employee> getEmployee(@PathVariable String Id){
		return employeeService.getEmployee(Id);
	}
	
	@RequestMapping(value="/employees" , method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value="/employees/{Id}" , method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable String Id, @RequestBody Employee employee) {
		employeeService.updateEmployee(Id, employee);
	}

	@RequestMapping(value="/employees/{Id}" , method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String Id) {
		employeeService.deleteEmployee(Id);
	}
}
