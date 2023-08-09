package com.wipro.pack.model;

import jakarta.persistence.*;

@Entity
public class Movie {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	private Long movieId;
	private String movieName;
	private int movieCollection;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Long movieId, String movieName, int movieCollection) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieCollection = movieCollection;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieCollection() {
		return movieCollection;
	}
	public void setMovieCollection(int movieCollection) {
		this.movieCollection = movieCollection;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieCollection=" + movieCollection + "]";
	}
	
}
