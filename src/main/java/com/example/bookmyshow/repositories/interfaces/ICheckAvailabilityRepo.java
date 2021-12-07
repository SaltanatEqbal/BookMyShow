package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface ICheckAvailabilityRepo {
    List<Movie> getAllMovies();
    List<Show> getAllShowsForAMovie(Movie movie);
    List<ShowSeat> getAllShowSeat(Show show);
    Status updateShowSeat(Show show, ShowSeat showSeat);
}
