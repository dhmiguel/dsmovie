package com.diegomiguel.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegomiguel.dsmovie.entities.Score;
import com.diegomiguel.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}
