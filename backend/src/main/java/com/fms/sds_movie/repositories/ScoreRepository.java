package com.fms.sds_movie.repositories;

import com.fms.sds_movie.entities.Score;
import com.fms.sds_movie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
