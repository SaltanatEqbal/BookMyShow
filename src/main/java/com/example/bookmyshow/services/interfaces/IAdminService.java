package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface IAdminService {
    void addMovies(Movie movie);
    void addShows(Movie movie, List<Show> shows);
    void addSeats(Show show, List<ShowSeat> showSeats);
}
