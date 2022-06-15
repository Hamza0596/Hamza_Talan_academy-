package com.talan.food.servicesImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.talan.food.dto.ReservationDto;
import com.talan.food.entities.Reservation;
import com.talan.food.helpers.ModelMapperConverter;
import com.talan.food.repositories.ReservationRepo;
import com.talan.food.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationRepo reservationRepo;
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	public ReservationServiceImpl() {
	}

	@Override
	public List<ReservationDto> getAllReservation() {
		return ModelMapperConverter.mapAll(reservationRepo.findAllByOrderById(),ReservationDto.class);
	}

	@Override
	public ReservationDto getReservationById(Long Id) {
		return ModelMapperConverter.map(reservationRepo.findById(Id), ReservationDto.class);
	}

	@Override
	public ReservationDto addReservation(ReservationDto reservationDto) {
		
		Reservation reservation = ModelMapperConverter.map(reservationDto,Reservation.class);
		reservationRepo.save(reservation);
		return ModelMapperConverter.map(reservation, ReservationDto.class);
		
	}

	@Override
	public ReservationDto editReservation(ReservationDto reservationDto) {
		Reservation editedReservation = ModelMapperConverter.map(reservationDto,Reservation.class);
		reservationRepo.save(editedReservation);
		//Debut traitement envoie Mail
		SimpleMailMessage sendReservation=new SimpleMailMessage();
		sendReservation.setTo("hamza.bouachir@talan.com");
		sendReservation.setText("Bonjour Gourmet ! Le collaborateur "+" "+editedReservation.getUser().getFirstName()+" "+editedReservation.getUser().getLastName()+" "+"à editer sa reservation  numéro"+" "+editedReservation.getId());
		sendReservation.setSubject("Reservation pour le Collaborateur : "+editedReservation.getUser().getFirstName()+" "+editedReservation.getUser().getLastName());
		javaMailSender.send(sendReservation);
		//Fin traitement envoie Mail
		return ModelMapperConverter.map(editedReservation, ReservationDto.class);
	}

	
	@Override
	public void deleteReservationById(Long id) {
		reservationRepo.deleteById(id);
	
	}


	@Override
	public List<ReservationDto> getReservationByUserId(Long Id) {
		return  ModelMapperConverter.mapAll(reservationRepo.findByUserId(Id), ReservationDto.class);
	}

	@Override
	public ReservationDto confirmReservation(ReservationDto reservationDto) {
		Reservation confirmedReservation = ModelMapperConverter.map(reservationDto,Reservation.class);
		confirmedReservation.setConfirmed(true);
		reservationRepo.save(confirmedReservation);
		//Debut traitement envoie Mail lorsque l'utilisateur clique sur confirmer ma reservation apres avoir bien sur terminer tout les commandes
		SimpleMailMessage sendReservation=new SimpleMailMessage();
		sendReservation.setTo("hamza.bouachir@talan.com");
		sendReservation.setText("Bonjour Gourmet ! Le collaborateur "+" "+confirmedReservation.getUser().getFirstName()+" "+confirmedReservation.getUser().getLastName()+" "+"à passé une nouvelle reservation sous le numero"+" "+confirmedReservation.getId());
		sendReservation.setSubject("Reservation pour le Collaborateur : "+confirmedReservation.getUser().getFirstName()+" "+confirmedReservation.getUser().getLastName());
		javaMailSender.send(sendReservation);
		//Fin traitement envoie Mail
		return ModelMapperConverter.map(confirmedReservation, ReservationDto.class);
     }
	
	
	

	

}
