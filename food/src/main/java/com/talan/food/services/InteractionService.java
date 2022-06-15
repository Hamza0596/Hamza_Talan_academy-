package com.talan.food.services;

import java.util.List;

import com.talan.food.dto.InteractionDto;

public interface InteractionService {

	public List<InteractionDto> getAllInteraction();
	public InteractionDto getInteractionById(Long Id);
	public InteractionDto addInteraction(InteractionDto interactionDto);
	public void deleteInteractionById(Long id);

}
