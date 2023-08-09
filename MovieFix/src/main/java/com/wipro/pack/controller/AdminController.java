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
public class AdminController {
	String userId = "stella@gmail.com";
	String userPassword = "steller";
	@Autowired
	private MovieRepository movieRepository;
	
	
	@GetMapping("/admin")
	public  String adminLogin() {
		return "admin-login";
	}
	
	@GetMapping("/adminPage")
	public  String adminPage() {
		return "admin-page";
	}
	
	@PostMapping("/verifyLogin")
	public  String verifyLogin(@RequestParam("id") String cUserID, @RequestParam("password") String cUserPassword) {
		if (cUserID.equals(userId) && cUserPassword.equals(userPassword)) {
			return "admin-page";
		}
		return "admin-login-failure";
	}
	
	@GetMapping("/addMovieForm")
	public  String addMovieForm() {
		return "admin-movie-form";
	}
	
	@PostMapping("/modifyMovie")
    public String modifyMovie(@RequestParam("movieId") Long id, @RequestParam("movieName") String movieName, @RequestParam("movieCollection") int movieCollection) {
//        model.addAttribute("movie", new Movie());
		Movie movie = new Movie();
		movie.setMovieId(id);
        movie.setMovieName(movieName);
        movie.setMovieCollection(movieCollection);
        movieRepository.save(movie);
        return "admin-add-Success";
    }
	
//	@GetMapping("/movie-form")
//    public String showMovieForm(Model model) {
//        model.addAttribute("movie", new Movie());
//        return "admin-movie-form";
//    }
	
	@PostMapping("/addMovie")
	public String addMovie(@RequestParam("movieId") Long id, @RequestParam("movieName") String movieName, @RequestParam("movieCollection") int movieCollection) {
        Movie movie = new Movie();
		movie.setMovieId(id);
        movie.setMovieName(movieName);
        movie.setMovieCollection(movieCollection);
        
		movieRepository.save(movie);
		return "admin-add-success";
    }
}

