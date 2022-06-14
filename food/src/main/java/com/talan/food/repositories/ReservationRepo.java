package com.talan.food.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.talan.food.entities.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {
	
	List<Reservation> findByUserId(Long id);
	

}
