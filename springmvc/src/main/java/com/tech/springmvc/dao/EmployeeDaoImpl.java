package com.tech.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tech.springmvc.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	@Override
	public Employee validate(int user, String password) {
		Employee employee = manager.find(Employee.class, user);
		if (employee != null) {
			if (employee.getPassword().equals(password)) {
				return employee;
			} else {

				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if (employee != null) {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee employee = manager.find(Employee.class, id);
		if (employee != null) {
			transaction.begin();
			manager.remove(employee);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Employee empDetails(int id) {
		Employee employee = manager.find(Employee.class, id);
		if (employee != null) {
			return employee;
		} else {
			return null;
		}
	}

	@Override
	public List<Employee> allEmpDeatils() {
		String query = "from Employee";
		Query query2 = manager.createQuery(query);
		List<Employee> list = query2.getResultList();
		return list;
	}

	@Override
	public boolean updateEmpDetails(Employee employee) {
		Employee employee1 = manager.find(Employee.class, employee.getId());
		if(employee1!=null) {
			employee1.setName(employee.getName());
			employee1.setPlace(employee.getPlace());
			employee1.setSal(employee.getSal());
			employee1.setPassword(employee.getPassword());
			transaction.begin();
			manager.persist(employee1);
			transaction.commit();
			return true;
		}
		return false;
	}
}
