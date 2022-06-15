package com.talan.food.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talan.food.entities.Interaction;

@Repository
public interface InteractionRepo extends JpaRepository<Interaction, Long> {
	List<Interaction> findAllByOrderById();

}
