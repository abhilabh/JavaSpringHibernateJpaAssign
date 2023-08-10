package com.wipro.pack.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.pack.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	List<Movie> findByMovieNameContaining(String movieName);
	List<Movie> findByMovieCollectionBetween(int minCollection, int maxCollection);
}
