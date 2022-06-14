package com.talan.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.talan.food.dto.ReservationDto;
import com.talan.food.servicesImpl.ReservationServiceImpl;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
	
@Autowired 
 ReservationServiceImpl reservationServiceImpl;

	public ReservationController() {
	}
	
@GetMapping("/All")
public List<ReservationDto> getAllReservation(){
	return reservationServiceImpl.getAllReservation();
	
}

@GetMapping("/GetAllById/{id}")
public ReservationDto getAllReservationById(@PathVariable("id") Long id){
	return reservationServiceImpl.getReservationById(id);
	
}

@GetMapping("/GetAllByuserId/{iduser}")
public List<ReservationDto> getAllReservationByUserId(@PathVariable(name="iduser") Long iduser){
	return reservationServiceImpl.getReservationByUserId(iduser);
	
}



@PostMapping("/Add")
public ReservationDto addReservation(@RequestBody ReservationDto reservationDto) {
	return reservationServiceImpl.addReservation(reservationDto);
	
}


@PostMapping("/Edit")
public ReservationDto editReservation(@RequestBody ReservationDto reservationDto) {
	return reservationServiceImpl.editReservation(reservationDto);
	
}

@DeleteMapping("/delete/{id}")
public void deleteReservation(@PathVariable("id") Long id) {
	reservationServiceImpl.deleteReservationById(id);
}
	
	
	

}
