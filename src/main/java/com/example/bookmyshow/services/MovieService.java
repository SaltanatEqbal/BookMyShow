package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.repositories.interfaces.IMovieRepo;
import com.example.bookmyshow.services.interfaces.IMovieService;

import java.util.List;

public class MovieService implements IMovieService {

    private IMovieRepo movieRepo;
    public MovieService(IMovieRepo movieRepo)
    {
        this.movieRepo = movieRepo;
    }
    @Override
    public List<Movie> getAllMovies() {
        return this.movieRepo.getAllMovies();
    }
}
