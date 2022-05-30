package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.AnnouncementDto;
import com.example.demo.Entity.AnnouncementImpl;
import com.example.demo.Service.AnnouncementService;

@RestController
public class AnnouncementController {
    
	
	@Autowired
	AnnouncementService announcementService ;
	
	public AnnouncementController() {
	}
	
	
	@GetMapping("getannouncment")
	public List<AnnouncementImpl> getAllAnnoucemnt() {
		return announcementService.getAllAnnouncemetService();
	}
	
	@GetMapping("getAnnouncementById/{id}")
	public  Optional<AnnouncementImpl> getAnnouncementById(@PathVariable(value="id") int id){
		
		return announcementService.getAnnouncementByIdService(id) ;
	}
	
	
	@DeleteMapping("deleteAnnouncemet/{id}")
	public void deleteAnnouncement(@PathVariable(value="id") int id) {
		
		announcementService.deleteAnnouncementService(id);
	}
	
	@GetMapping("getbyprice/{price}")
	public List<AnnouncementImpl> getprice(@PathVariable(value="price") int price){
		return announcementService.getAnnouncementByprice(price);
		
	}
	
	
	@GetMapping("getbyviewnumber/{viewnumber}")
		public List<AnnouncementDto> getAnnouncementByViews(@PathVariable(value="viewnumber") int viewnumber){
		
		return 	announcementService.getAnnouncmeentByViewNumber(viewnumber);
		}
	

}
