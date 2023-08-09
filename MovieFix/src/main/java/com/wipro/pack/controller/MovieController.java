package com.wipro.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.pack.model.Movie;
import com.wipro.pack.repo.MovieRepository;

@Controller
public class MovieController {
	@Autowired
	private MovieRepository movieRepository;
	@GetMapping("/allmovie")
	public @ResponseBody List<Movie> getAllMovie() {
		return movieRepository.findAll();
	}
	
	@GetMapping("/movie-form")
    public String showStudentForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "movieForm";
    }
	
	@PostMapping("/addMovie")
	public @ResponseBody Movie addMovie(@RequestParam("movieName") String movieName, @RequestParam("movieCollection") int movieCollection) {
        Movie movie = new Movie();
        movie.setMovieName(movieName);
        movie.setMovieCollection(movieCollection);
        
		movieRepository.save(movie);
		return movie;
    }
}
