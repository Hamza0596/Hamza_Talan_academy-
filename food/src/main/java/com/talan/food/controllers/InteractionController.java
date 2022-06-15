package com.talan.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talan.food.dto.InteractionDto;
import com.talan.food.services.InteractionService;

@RestController
@RequestMapping("/api/interactions")
public class InteractionController {

@Autowired
InteractionService interactionService;
	
	
	public InteractionController() {
	}
	
	@GetMapping("/All")
	public List<InteractionDto> getAllInteractions() {
		
		return interactionService.getAllInteraction();
	}
	
	@GetMapping("/GetById/{id}")
	public InteractionDto getInteractionsById(@PathVariable ("id") Long id) {
	
		return interactionService.getInteractionById(id);
	}
	
	
	@PostMapping("/Add")
	public InteractionDto addInteraction(@RequestBody InteractionDto interactionDto ) {
		
		return interactionService.addInteraction(interactionDto);
		
	}
	
	
	@DeleteMapping("delete/{id}")
	public void deleteInteraction(@PathVariable("id") Long id) {
		
		interactionService.deleteInteractionById(id);
	}
	
	

}
