package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.AnnouncementDto;
import com.example.demo.Entity.AnnouncementImpl;
import com.example.demo.Repository.AnnouncementRepository;
import com.example.demo.helper.ModelMapperConverter;

@Service
public class AnnouncementService {
    @Autowired
	AnnouncementRepository repo;
    
    @Autowired
    ModelMapperConverter   modelMapperConverter;
	
	public AnnouncementService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List <AnnouncementImpl> getAllAnnouncemetService(){
		
		return repo.findAll();
	}
	
	
	public Optional<AnnouncementImpl> getAnnouncementByIdService(int id){
		
		return repo.findById(id);
	}
	
	public String deleteAnnouncementService(int id) {
		
		repo.deleteById(id);
		return "ok";
	}
	
    public List<AnnouncementImpl> getAnnouncementByprice(int price){
		
		return repo.getAnnouncementWithMaxPrice(price);
	}

    public List<AnnouncementDto> getAnnouncmeentByViewNumber(int view){
    	
    	return  modelMapperConverter.mapAll(repo.getAnnouncementByViewNumber(view), AnnouncementDto.class);
    	
    }
}
