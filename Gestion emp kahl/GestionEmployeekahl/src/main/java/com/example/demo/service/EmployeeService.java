  package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.repo.EmployeeRepo;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	

	
	public Employee  addEmployee(Employee emp) {
		emp.setemployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(emp);
		
	}
	
	public List<Employee> findAllEmployee(){
		
		return employeeRepo.findAll();
	}
	
	public Employee UpdateEmployee(Employee emp) {
		
		return employeeRepo.save(emp);
		
	}
	
	
	public  java.util.Optional<Employee> findEmployeeById(long id) {
		 
		
		return employeeRepo.findById(id) ;
	 }
		
	
	
public void deleteeEmployee(long id) {
		
		 employeeRepo.deleteEmployeeById(id);
		
	}


	
	
	
	
	
	
	

	

}
