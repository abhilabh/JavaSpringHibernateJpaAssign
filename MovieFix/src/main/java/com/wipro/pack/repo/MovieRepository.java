package com.wipro.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.pack.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
