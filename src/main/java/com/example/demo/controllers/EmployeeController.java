package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService eservice;

	@GetMapping("/getall")
	public List<Employee> getAllEmp() {
		return eservice.getAllemp();
	}

	@PostMapping("/add")
	public Employee saveemp(@RequestBody Employee e) {
		return eservice.SaveEmp(e);
	}

	@GetMapping("/find/{Employee_id}")
	public Employee findEmployeeByEmployee_id(@PathVariable int Employee_id) {
		return eservice.findEmployeeByEmployee_id(Employee_id);

	}
}
