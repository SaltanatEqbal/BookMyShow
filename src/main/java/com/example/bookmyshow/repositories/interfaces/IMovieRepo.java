package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.models.Movie;

import java.util.List;

public interface IMovieRepo {
    List<Movie> getAllMovies();
}
