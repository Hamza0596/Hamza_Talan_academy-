package com.talan.food.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.talan.food.dto.ReservationDto;
import com.talan.food.entities.User;

@SpringBootTest
@AutoConfigureMockMvc
public class ReservationControllerTest {

	
	    @Autowired
	    private MockMvc mockMvc;
	    
	
	    
	    
	    @Test
	    public void testGetReservation() throws Exception {
	        mockMvc.perform(get("/api/reservations/All"))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$[4].price", is(12.6)));
	    }
	    
	    
	    @Test
	    public void testGetReservationById() throws Exception {
	        mockMvc.perform(get("/api/reservations/GetAllById/5"))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("price", is(35.0)));
	    }
	    
	    @Test
	    public void testGetAllReservationByUserId() throws Exception {
	        mockMvc.perform(get("/api/reservations/GetAllByuserId/3"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].price", is(35.0)));
	    	
	    }
	    
	    
	    public static String asJsonString(final Object obj) {
	        try {
	            return new ObjectMapper().writeValueAsString(obj);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
	    
	    @Test
	    public void testaddReservation() throws Exception {
	      
	        mockMvc.perform(post("/api/reservations/Add")
	                .contentType("application/json")
	                .content(asJsonString((new ReservationDto(12.6, new User(1L,"aaaaaa", "bbbbbbbbbb") ,new Date())))))
	              .andExpect(status().isOk());
	    }
	    
	    @Test
	    public void editReservation() throws Exception {
	      
	        mockMvc.perform(post("/api/reservations/Edit")
	                .contentType("application/json")
	                .content(asJsonString((new ReservationDto(13L,12.8, new User(1L,"Ali ", "Bouzayen") ,new Date())))))
	              .andExpect(status().isOk());
	    }
	    
	    @Test
	    public void confirmReservation() throws Exception {
	    	
	        mockMvc.perform(post("/api/reservations/confirmReservation")
	                .contentType("application/json")
	                .content(asJsonString((new ReservationDto(18L, 20.8, new User(1L,"Hamza","Bouachir"), new Date())))))
	              .andExpect(status().isOk());
	    	

	    }
	    
	    

	    



	}
