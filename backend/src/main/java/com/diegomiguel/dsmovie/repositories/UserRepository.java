package com.diegomiguel.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegomiguel.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
