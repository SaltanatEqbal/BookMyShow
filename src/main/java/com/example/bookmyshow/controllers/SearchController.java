package com.example.bookmyshow.controllers;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.services.MovieService;
import com.example.bookmyshow.services.SeatService;
import com.example.bookmyshow.services.ShowService;
import com.example.bookmyshow.services.interfaces.IMovieService;
import com.example.bookmyshow.services.interfaces.ISeatService;
import com.example.bookmyshow.services.interfaces.IShowService;

import java.util.List;

public class SearchController {

    private IMovieService movieService;
    private IShowService showService;
    private ISeatService seatService;
    public SearchController(IMovieService movieService, IShowService showService, ISeatService seatService)
    {
        this.movieService = movieService;
        this.showService = showService;
        this.seatService = seatService;
    }

    public List<Movie> getAllMovies()
    {
        return movieService.getAllMovies();
    }

    public List<Show> getAllShowsOfAMovie(Movie movie)
    {
        return showService.getAllShowsOfMovie(movie);
    }

    public List<ShowSeat> getAllSeatOfAShow(Show show)
    {
        return seatService.getAllSeat(show);
    }
}
