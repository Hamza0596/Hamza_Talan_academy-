package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface Repo extends JpaRepository<UserImpl, Integer> {

	
  /* @Query("SELECT u FROM User u WHERE u.first_name = ?1 ")
    List<UserImpl> findByTitle(String first_name);	*/
	
	@Query("SELECT u FROM UserImpl u WHERE u.pseudo =:p")
	public List<UserImpl> findbypseudo(@Param("p") String p , Sort sort);
	
}
