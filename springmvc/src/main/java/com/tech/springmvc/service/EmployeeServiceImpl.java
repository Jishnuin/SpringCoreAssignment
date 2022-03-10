package com.tech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.springmvc.dao.EmployeeDao;
import com.tech.springmvc.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee validate(int user, String password) {
		if (user >= 0) {
			return dao.validate(user, password);
		} else {
			return null;
		}
	}

	@Override
	public boolean addEmployee(Employee employee , int id) {
		if(employee!=null) {
			if(id>0) {
				return dao.addEmployee(employee);
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		if(id>0) {
			return dao.deleteEmployee(id);
		}else {
			return false;
		}
	}

	@Override
	public Employee empDetails(int id) {
		if(id>0) {
			return dao.empDetails(id);
		}
		return null;
	}

	@Override
	public List<Employee> allEmpDeatils() {
		return dao.allEmpDeatils();
	}

	@Override
	public boolean updateEmpDetails(Employee employee) {
		if(employee.getId()>0) {
			return dao.updateEmpDetails(employee);
		}
		return false;
	}
}
