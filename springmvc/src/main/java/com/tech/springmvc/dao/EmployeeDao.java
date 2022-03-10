package com.tech.springmvc.dao;

import java.util.List;

import com.tech.springmvc.dto.Employee;

public interface EmployeeDao {
	public Employee validate(int user , String password);
	
	public boolean addEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
	
	public Employee empDetails(int id);
	
	public List<Employee> allEmpDeatils();
	
	public boolean updateEmpDetails(Employee employee);
}
