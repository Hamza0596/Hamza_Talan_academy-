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
import com.talan.food.dto.InteractionDto;
import com.talan.food.dto.ReservationDto;
import com.talan.food.entities.User;

@SpringBootTest
@AutoConfigureMockMvc
public class InteractionControllerTest {

	
    @Autowired
    private MockMvc mockMvc;
    
    
    @Test
    public void testGetInteraction() throws Exception {
        mockMvc.perform(get("/api/interactions/All"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].description", is("Bnina ")));
    }
    
    
    @Test
    public void testGetInteractionById() throws Exception {
        mockMvc.perform(get("/api/interactions/GetById/2"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("description", is("Bnina ")));
    }
    
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
    @Test
    public void testaddInteraction() throws Exception {
      
        mockMvc.perform(post("/api/interactions/Add")
                .contentType("application/json")
                .content(asJsonString((new InteractionDto("Reclamation","quantité reduite",2, new User(1L,"aaaaaa", "bbbbbbbbbb") )))))
              .andExpect(status().isOk());
    }

}
