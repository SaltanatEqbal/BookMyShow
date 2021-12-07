package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.services.interfaces.IShowService;

import java.util.List;

public class ShowService implements IShowService {

    private IShowService showService;
    public ShowService(IShowService showService)
    {
        this.showService = showService;
    }
    @Override
    public List<Show> getAllShowsOfMovie(Movie movie) {
        return showService.getAllShowsOfMovie(movie);
    }
}
