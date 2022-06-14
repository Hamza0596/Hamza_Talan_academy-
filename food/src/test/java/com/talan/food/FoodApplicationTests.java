package com.talan.food;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.talan.food.entities.Reservation;
import com.talan.food.entities.User;
import com.talan.food.repositories.ReservationRepo;

@SpringBootTest
class FoodApplicationTests {
   
	@Autowired
	ReservationRepo reservationRepo;
	@Test
	void createReservation() {
		
		
		Reservation reserv = new Reservation(12.6, new Date());
		
		reservationRepo.save(reserv);
	}

}
