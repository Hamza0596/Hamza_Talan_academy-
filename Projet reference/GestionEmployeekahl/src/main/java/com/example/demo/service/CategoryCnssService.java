package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CategoryCnss;
import com.example.demo.repo.CategoryRepo;

@Service
public class CategoryCnssService {

	public CategoryCnssService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    private CategoryRepo categoryRepo;
	
	
	public List<CategoryCnss> getAllCategory() {
		
		
		return categoryRepo.findAll();
	}
	
	

}
