package com.wipro.pack.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.pack.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {
	List<Movie> findByMovieNameIgnoreCaseContaining(String movieName);
	List<Movie> findByMovieCollectionBetween(int minCollection, int maxCollection);
}
