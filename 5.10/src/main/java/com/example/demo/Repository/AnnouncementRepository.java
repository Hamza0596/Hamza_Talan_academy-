package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.AnnouncementImpl;

@Repository
public interface AnnouncementRepository  extends JpaRepository<AnnouncementImpl, Integer>{
	
	@Query(value = "SELECT * FROM announcement WHERE price < :maxPrice", nativeQuery = true)
    public List<AnnouncementImpl> getAnnouncementWithMaxPrice(Integer maxPrice);
    
	
	@Query(value="SELECT a From AnnouncementImpl a WHERE a.viewNumber =:vn")
	 public List<AnnouncementImpl> getAnnouncementByViewNumber(@Param(value = "vn") int vn);
	
}
