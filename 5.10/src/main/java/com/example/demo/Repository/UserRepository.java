package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserImpl;

@Repository
public interface UserRepository extends JpaRepository<UserImpl, Integer> {

	
  @Query("SELECT user FROM UserImpl user WHERE role.id= ?1")
    List<UserImpl> findByRole(@Param("rolee") int rolee);
   
 
  UserImpl findByMail(String mail);
  UserImpl findByPseudo(String pseudo);
  
 
	
}
