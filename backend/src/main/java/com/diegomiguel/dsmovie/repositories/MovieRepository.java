package com.diegomiguel.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegomiguel.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
