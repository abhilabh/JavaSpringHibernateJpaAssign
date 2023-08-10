package com.wipro.pack.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/searchByIdForm")
	public  String searchByIdForm(Model model) {
		return "user-search-movie-by-id";
	}
	@GetMapping("/searchByNameForm")
	public  String searchByNameForm(Model model) {
		return "user-search-movie-by-name";
	}
	@GetMapping("/searchByCollectionForm")
	public  String searchByCollectionForm(Model model) {
		return "user-search-movie-by-collection";
	}
	
	@PostMapping("/searchById")
	public  String searchById(Model model, @RequestParam("movieId") Long id) {
		Optional<Movie> movieOptional = movieRepository.findById(id);
		System.out.println(movieOptional);
		List<Optional<Movie>> movies = new ArrayList<>();
		if (movieOptional.isPresent()) {
	        movies.add(movieOptional);
	    }
	    
	    model.addAttribute("movies", movies);
	    return "user-search-result-success";
	}
	@PostMapping("/searchByName")
    public String searchByName(@RequestParam("movieName") String movieName, Model model) {
		System.out.println(movieName);
        List<Movie> movies = movieRepository.findByMovieNameContaining(movieName);
//        if (movie.isPresent()) {
//            model.addAttribute("movies", List.of(movie.get())); // Wrap in a List
//        }
        model.addAttribute("movies", movies);
        System.out.println(movies);
        return "movie-list"; // Your JSP view name
    }
	@PostMapping("/searchByCollection")
	public  String searchByCollection(Model model, @RequestParam("collectionFrom") int collectionFrom, @RequestParam("collectionTo") int collectionTo) {
        List<Movie> movies = movieRepository.findByMovieCollectionBetween(collectionFrom, collectionTo);
//        if (movie.isPresent()) {
//            model.addAttribute("movies", List.of(movie.get())); // Wrap in a List
//        }
        model.addAttribute("movies", movies);
        System.out.println(movies);
        return "movie-list"; // Your JSP view name
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
