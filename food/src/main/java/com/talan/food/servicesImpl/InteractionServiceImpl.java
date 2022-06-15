package com.talan.food.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.talan.food.dto.InteractionDto;
import com.talan.food.entities.Interaction;
import com.talan.food.helpers.ModelMapperConverter;
import com.talan.food.repositories.InteractionRepo;
import com.talan.food.services.InteractionService;

@Service
public class InteractionServiceImpl implements InteractionService {

    @Autowired
	private InteractionRepo interactionRepo ;
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public List<InteractionDto> getAllInteraction() {
		return ModelMapperConverter.mapAll(interactionRepo.findAllByOrderById(), InteractionDto.class );
	}

	@Override
	public InteractionDto getInteractionById(Long Id) {
		return ModelMapperConverter.map(interactionRepo.findById(Id), InteractionDto.class);
	}

	@Override
	public InteractionDto addInteraction(InteractionDto interactionDto) {
	Interaction interaction = ModelMapperConverter.map(interactionDto, Interaction.class);
	interactionRepo.save(interaction);
	//Debut traitement envoie Mail
			SimpleMailMessage sendInteraction=new SimpleMailMessage();
			sendInteraction.setTo("hamza.bouachir@talan.com");
			sendInteraction.setText("Bonjour Gourmet ! Le collaborateur "+" "+interaction.getUser().getFirstName()+" "+interaction.getUser().getLastName()+" "+"à posté une nouvelle"+" "+interaction.getType()+" " + " sous le numéro"+" "+interaction.getId());
			sendInteraction.setSubject("Nouvelle : "+" "+interaction.getType()+""+"de la part du collaborateur"+" "+interaction.getUser().getFirstName()+" "+interaction.getUser().getLastName());
			javaMailSender.send(sendInteraction);
			//Fin traitement envoie Mail
	 
		return ModelMapperConverter.map(interaction, InteractionDto.class);
	}

	@Override
	public void deleteInteractionById(Long id) {
		interactionRepo.deleteById(id);
		
	}

}
