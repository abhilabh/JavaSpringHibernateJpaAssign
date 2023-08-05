package org.example;

import javax.persistence.*;

@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    private String movieName;
    private String movieActor;
    public int getMovieId() {
        return movieId;
    }
    public Movie() {}

    Movie(int movieId, String movieName, String movieActor) {
        super();
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieActor = movieActor;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieActor() {
        return movieActor;
    }
    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieActor='" + movieActor + '\'' +
                '}';
    }
}

