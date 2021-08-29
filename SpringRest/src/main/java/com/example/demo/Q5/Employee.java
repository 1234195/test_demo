package com.example.demo.Q5;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String Id;
	private String Name;
	private String Department;
	private String Designation;
	private int Salary;
	
	public Employee() {
		
	}
	
	public Employee(String Id, String Name, String Department, String Designation,
			int Salary) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Department = Department;
		this.Designation = Designation;
		this.Salary = Salary;
	}

	public String getEmployeeId() {
		return Id;
	}

	public void setEmployeeId(String Id) {
		this.Id = Id;
	}

	public String getEmployeeName() {
		return Name;
	}

	public void setEmployeeName(String Name) {
		this.Name =Name;
	}

	public String getEmployeeDepartment() {
		return Department;
	}

	public void setEmployeeDepartment(String Department) {
		this.Department = Department;
	}

	public String getEmployeeDesignation() {
		return Designation;
	}

	public void setEmployeeDesignation(String Designation) {
		this.Designation = Designation;
	}

	public int getEmployeeSalary() {
		retur Salary;
	}

	public void setEmployeeSalary(int Salary) {
		this.Salary = Salary;
	}
	
	
}
