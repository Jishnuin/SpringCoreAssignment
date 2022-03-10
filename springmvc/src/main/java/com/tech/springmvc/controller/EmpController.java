package com.tech.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tech.springmvc.dto.Employee;
import com.tech.springmvc.service.EmployeeService;

@Controller
public class EmpController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/log")
	public String login() {
		return "login";
	}

	int empId;

	@PostMapping("/login")
	public String submitEmp(ModelMap map, int user, String password, HttpServletRequest request) {

		Employee employee = service.validate(user, password);
		HttpSession session = request.getSession();
		session.setAttribute("timein", employee);
		if (employee != null) {
			map.addAttribute("msg", employee.getName());
			empId = employee.getId();
			return "home";
		} else {
			map.addAttribute("errmsg", "Invalid Id and Password");
			return "login";
		}
	}

	@GetMapping("/register")
	public String registerEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee) {
		if (employee != null) {
			return "register";
		} else {
			map.addAttribute("errmsg", "Please LogIn First...!!!");
			return "login";
		}
	}

	@PostMapping("/addemp")
	public String addEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee,
			Employee employee2, int id) {
		if (employee2 != null) {
			Boolean res = service.addEmployee(employee2, id);
			if (res) {
				map.addAttribute("msg", "Employee Added Sucessfully");
				return "register";
			} else {
				map.addAttribute("msg", "Employee Not Added");
				return "register";
			}
		} else {
			map.addAttribute("errmsg", "please Login first");
			return "login";
		}
	}

	@GetMapping("/update")
	public String updateEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee,
			Employee employee2) {
		if (employee != null) {
			map.addAttribute("id", empId);
			return "update";
		} else {
			map.addAttribute("errmsg", "Please LogIn First...!!!");
			return "login";
		}
	}
	
	@PostMapping("/update_emp")
	public String updateEmpDetails(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee,
			Employee employee2) {
		if (employee != null) {
			Boolean res = service.updateEmpDetails(employee2);
			if (res) {
				map.addAttribute("msg", "Employee Updated Sucessfully");
				return "update";
			} else {
				map.addAttribute("msg", "Employee Not updated");
				return "update";
			}
		} else {
			map.addAttribute("errmsg", "please Login first");
			return "login";
		}
	}

	@GetMapping("/delete")
	public String delEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee) {
		if (employee != null) {
			return "delete";
		} else {
			map.addAttribute("errmsg", "Please LogIn First...!!!");
			return "login";
		}
	}

	@PostMapping("/deleteemp")
	public String deleteEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee,
			int id) {
		if (employee != null) {
			Boolean res = service.deleteEmployee(id);
			if (res) {
				map.addAttribute("msg", "Employee deleted Sucessfully");
				return "delete";
			} else {
				map.addAttribute("msg", "Employee Not deleted");
				return "delete";
			}
		} else {
			map.addAttribute("errmsg", "please Login first");
			return "login";
		}
	}

	@GetMapping("/show")
	public String showEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee) {
		if (employee != null) {
			return "showempdetail";
		} else {
			map.addAttribute("errmsg", "Please LogIn First...!!!");
			return "login";
		}
	}

	@PostMapping("/showempdet")
	public String showEmp(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee,
			int id) {
		if (employee != null) {
			Employee employee2 = service.empDetails(id);
			if (employee2 != null) {
				map.addAttribute("details", employee2);
				return "showempdetail";
			} else {
				map.addAttribute("msg", "Employee Not deleted");
				return "showempdetail";
			}
		} else {
			map.addAttribute("errmsg", "please Login first");
			return "login";
		}
	}
	
	@GetMapping("/showallemp")
	public String showallEmpdetails(ModelMap map, @SessionAttribute(name = "timein", required = false) Employee employee) {
		if (employee != null) {
			List<Employee> list = service.allEmpDeatils();
			if (list != null) {
				map.addAttribute("details", list);
				return "showallempdetails";
			} else {
				map.addAttribute("msg", "Employee Not fetched");
				return "showallempdetail";
			}
		} else {
			map.addAttribute("errmsg", "please Login first");
			return "login";
		}
	}
}
