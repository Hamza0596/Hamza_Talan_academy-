package com.example.demo.controllerEmployee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.service.EmployeeService;

@RestController

@RequestMapping("/Employee")
public class ControllerEmployee {
	@Autowired
	EmployeeService employeeService;

	public ControllerEmployee() {
		// TODO Auto-generated constructor stub
	}
	Employee e;
	
	@GetMapping("all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> employees=employeeService.findAllEmployee();
		return new ResponseEntity<>(employees,HttpStatus.OK);
		
	} 
	
	
	@GetMapping("find/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") long id){
		
		
		return employeeService.findEmployeeById(id);
		
	}

	
	@PostMapping("/add")
	public  ResponseEntity<Employee> addEmployee(@RequestBody Employee employee ){
		
		Employee e= employeeService.addEmployee(employee);
		
		return new ResponseEntity<>(e,HttpStatus.CREATED);
		
	}
	
	
	@PostMapping("/update")
	public  ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee ){
		
		Employee e= employeeService.addEmployee(employee);
		
		return new ResponseEntity<>(e,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<?> deleteEmployee(@PathVariable("id") long id ){
		
		employeeService.deleteeEmployee(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
