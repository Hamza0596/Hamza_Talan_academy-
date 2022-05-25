package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Repo repo;
	
	public Service() {
		// TODO Auto-generated constructor stub
	}
	
	
	public  List<UserImpl> getuserService() {
	    
		return repo.findAll();
	    
	}
	
	
	public Optional<UserImpl> getUserByIdService(int id) {
		
		return repo.findById(id);
	}
	
	public String addUserService(UserImpl user) {
		    	repo.save(user);
		    	return "User ajouter avec succés";
	}
	
    public String deleteUser(int id) {
    	repo.deleteById(id);
		return "ok" ;
    }
    
    
    public List<UserImpl> getUserByPseudo(String pseudo) {
    	return repo.findbypseudo(pseudo, Sort.by("Name"));
		
    }
  


}
