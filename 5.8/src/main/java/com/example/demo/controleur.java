package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controleur {

	public controleur() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private Service service;

	
	
	
	 @GetMapping("users")	
	public  List<UserImpl> getuser() {
	    return service.getuserService();
	}
    
	 
	 
    @GetMapping("usersbyid/{id}")	
   	public  Optional<UserImpl> getUserById(@PathVariable(value="id") int id) {   	
  	    return service.getUserByIdService(id);
   	}
    
    
    @PostMapping("addUser")
    public void addUser(@RequestBody UserImpl user) {
    	service.addUserService(user);
    	
    }
    
    @DeleteMapping("deleteUser/{id}")
    public void deleteUserByid(@PathVariable(value="id") int id) {
    	service.deleteUser(id);
    }
    
	 
    @GetMapping("pseudo/{pseudo}")	
   	public  List<UserImpl> getUserByPseudo(@PathVariable(value="pseudo") String pseudo) {   	
  	    return service.getUserByPseudo(pseudo);
   	}   
 
    

}
