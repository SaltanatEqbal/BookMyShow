package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.repositories.interfaces.ICheckAvailabilityRepo;
import com.example.bookmyshow.repositories.interfaces.IShowRepo;

import java.util.List;

public class ShowRepository implements IShowRepo {

    private ICheckAvailabilityRepo checkAvailability;
    public ShowRepository(ICheckAvailabilityRepo iCheckAvailability)
    {
        this.checkAvailability = iCheckAvailability;
    }

    @Override
    public List<Show> getAllShowsOfMovie(Movie movie) {
        return this.checkAvailability.getAllShowsForAMovie(movie);
    }
}
