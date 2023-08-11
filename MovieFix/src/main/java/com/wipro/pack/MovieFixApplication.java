package com.wipro.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.pack.model.Movie;
import com.wipro.pack.repo.MovieRepository;

@SpringBootApplication
public class MovieFixApplication implements CommandLineRunner{
	
	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieFixApplication.class, args);
	}
	
	@Override
    public void run(String... args) {
		movieRepository.save(new Movie("M001", "The Mummy", 3000000));
		movieRepository.save(new Movie("M002", "The Firm", 2000000));

		movieRepository.save(new Movie("M003", "Mr. Bean", 2500000 ));

		movieRepository.save(new Movie("M004", "Logan", 2500000 ));

		movieRepository.save(new Movie("M005", "The Avengers: Age of Ultron", 6000000));

		movieRepository.save(new Movie("M006", "Top Gun", 2000000));

		movieRepository.save(new Movie("M007", "Moana", 4000000));

		movieRepository.save(new Movie("M008", "Finding Nemo", 5500000));

		movieRepository.save(new Movie( "M009", "The Mummy Returns", 9000000));
		movieRepository.save(new Movie("M010", "Star Wars", 7000000));


		
	}

}
