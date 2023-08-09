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
	public  String getAllMovie(Model model) {
		List<Movie> movies = movieRepository.findAll();
		model.addAttribute("movies", movies);
		return "movie-list";
	}
	
	@GetMapping("/")
	public  String adminLogin(Model model) {
		return "user-home";
	}
	
	@GetMapping("/searchById")
	public  String searchById(Model model) {
		return "user-search-movie-by-id";
	}
	@GetMapping("/searchByName")
	public  String searchByName(Model model) {
		return "user-search-movie-by-name";
	}
	@GetMapping("/searchByCollection")
	public  String searchByCollection(Model model) {
		return "user-search-movie-by-collection";
	}
	
	@GetMapping("/searchPage")
	public  String showSearchPage(Model model) {
		return "user-search-page";
	}
	
	
//	@GetMapping("/movie-form")
//    public String showStudentForm(Model model) {
//        model.addAttribute("movie", new Movie());
//        return "movieForm";
//    }
	
//	@PostMapping("/addMovie")
//	public @ResponseBody Movie addMovie(@RequestParam("movieName") String movieName, @RequestParam("movieCollection") int movieCollection) {
//        Movie movie = new Movie();
//        movie.setMovieName(movieName);
//        movie.setMovieCollection(movieCollection);
//        
//		movieRepository.save(movie);
//		return movie;
//    }
}
