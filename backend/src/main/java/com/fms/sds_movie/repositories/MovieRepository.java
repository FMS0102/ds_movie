package com.fms.sds_movie.repositories;

import com.fms.sds_movie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
