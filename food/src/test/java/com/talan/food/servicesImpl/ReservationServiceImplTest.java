package com.talan.food.servicesImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import com.talan.food.dto.ReservationDto;
import com.talan.food.entities.User;

@SpringBootTest
@AutoConfigureMockMvc
public class ReservationServiceImplTest {


	
    @Autowired
    ReservationServiceImpl reservationServiceImpl;
    
	@Test
    public void testService() throws Exception {
        User user = new User("Alain", "Brader");
    	ReservationDto reservationDto= new ReservationDto(6L,12.6,user, new Date());
    	assertEquals(reservationServiceImpl.getReservationById(6L).getPrice(), reservationDto.getPrice());	
    	
    }
	
	@Test
    public void testGetAllReservation() throws Exception {
       
    	assertEquals(reservationServiceImpl.getAllReservation().get(0) .getPrice(), 12.6);	
    	
    }
	
	
	@Test 
	void testGetReservationByUserId() throws Exception{
		assertEquals(reservationServiceImpl.getReservationByUserId(1L).get(0) .getPrice(), 12.6);	
	}
	
	
	@Test 
	void testaddReservation() throws Exception{
		User user= new User(1L,"Hamza","Bouachir");
		ReservationDto reservationDto = new ReservationDto(18L, 20.1, user, new Date());
		assertEquals(reservationServiceImpl.addReservation(reservationDto).getPrice(), 20.1);	
	}
	
	
	@Test 
	void testEditReservation() throws Exception{
		User user= new User(1L,"Hamza","Bouachir");
		ReservationDto reservationDto = new ReservationDto(18L, 20.8, user, new Date());
		assertEquals(reservationServiceImpl.editReservation(reservationDto).getId(), 18L);	
	}
	
	@Test 
	void testConfirmReservation() throws Exception{
		User user= new User(1L,"Hamza","Bouachir");
		ReservationDto reservationDto = new ReservationDto(18L, 20.8, user, new Date());
		assertEquals(reservationServiceImpl.confirmReservation(reservationDto).getId(), 18L);	
	}
	
	
	
	
	
	
	
	

	
	

}