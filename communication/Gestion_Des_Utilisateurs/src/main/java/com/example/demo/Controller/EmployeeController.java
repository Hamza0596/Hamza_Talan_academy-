package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeService.EmployeeService;
import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
@Autowired
private EmployeeService employeeService;
@Autowired
private  EmployeeRepository  employeeRepository;

	public EmployeeController() {
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees() ;
		
		
	}
	
	
	@PostMapping("/update/{id}/{name}")
	public void  updateUser(@PathVariable Long id, @PathVariable String name){
		
		Employee employe = employeeRepository.getById(id);
		employe.setFirstName(name);
		employeeRepository.save(employe);
		
	}
	
	
	
	

}
