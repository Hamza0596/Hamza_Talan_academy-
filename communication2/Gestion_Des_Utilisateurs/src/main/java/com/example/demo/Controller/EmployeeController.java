package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeService.EmployeeService;
import com.example.demo.Model.Employee;
import com.example.demo.Model.exception.RessourcesNotFoundException;
import com.example.demo.Repo.EmployeeRepository;

@RestController
@CrossOrigin
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
	public void  updateEmployee(@PathVariable Long id, @PathVariable String name){
		
		Employee employe = employeeRepository.getById(id);
		employe.setFirstName(name);
		employeeRepository.save(employe);
		
	}
	
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
    	return employeeService.addEmployee(employee);
    	
    	 
    }
    
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee>  getEmployeeById(@PathVariable Long id){
		Employee employe= employeeService.getEmployeeById(id) ;

		return ResponseEntity.ok(employe);
		
		
	}
	
	
	
	
	

}
