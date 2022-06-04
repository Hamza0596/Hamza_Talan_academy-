package com.example.demo.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepository;

@Service
public class EmployeeService {
	
    @Autowired
    EmployeeRepository employeeRepository;
 
	public EmployeeService() {
	}
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
		
	}
	
	public Employee  addEmployee(Employee e) {
		return employeeRepository.save(e);
		
	}
	
	public Employee   getEmployeeById( Long id) {
		return employeeRepository.getById(id);
		
	}
	
	
	

}
