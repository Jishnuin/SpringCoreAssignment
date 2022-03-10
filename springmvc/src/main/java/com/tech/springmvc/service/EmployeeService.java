package com.tech.springmvc.service;

import java.util.List;

import com.tech.springmvc.dto.Employee;

public interface EmployeeService {
	public Employee validate(int id , String password);
	
	public boolean addEmployee(Employee employee , int id);
	
	public boolean deleteEmployee(int id);
	
	public Employee empDetails(int id);
	
	public List<Employee> allEmpDeatils();
	
	public boolean updateEmpDetails(Employee employee);
}
