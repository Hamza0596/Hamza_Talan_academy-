package com.example.demo.controllerEmployee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CategoryCnss;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.service.CategoryCnssService;

@RestController
@RequestMapping("/cat")
@CrossOrigin
public class CategoryController {
	

	public CategoryController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private CategoryRepo categoryRepo ;
	
	@Autowired
	private CategoryCnssService  categoryCnssService;
	
	
	@GetMapping("/allCat")
	public List<CategoryCnss> getAllCat(){
		return categoryCnssService.getAllCategory();
				
		
	}
	
	@GetMapping("/Catbyid/{id}")
	public Optional<CategoryCnss> getbyid(@PathVariable("id") long id){
		return categoryRepo.findById(id);
				
		
	}

}
