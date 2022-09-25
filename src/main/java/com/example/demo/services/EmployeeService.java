package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository erepo;

	public List<Employee> getAllemp() {
		// System.out.println(erepo.findAll());
		return erepo.findAll();
	}

	public Employee SaveEmp(Employee e) {
		return erepo.save(e);
	}

	public Employee findEmployeeByEmployee_id(int Employee_id) {
		return erepo.findById(Employee_id).orElse(null);
	}

}
