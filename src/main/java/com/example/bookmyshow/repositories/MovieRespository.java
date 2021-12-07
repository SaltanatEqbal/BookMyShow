package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.repositories.interfaces.ICheckAvailabilityRepo;
import com.example.bookmyshow.repositories.interfaces.IMovieRepo;

import java.util.List;

public class MovieRespository implements IMovieRepo {

    private ICheckAvailabilityRepo checkAvailability;
    public MovieRespository(ICheckAvailabilityRepo iCheckAvailability)
    {
        this.checkAvailability = iCheckAvailability;
    }

    @Override
    public List<Movie> getAllMovies() {
        return this.checkAvailability.getAllMovies();
    }
}
