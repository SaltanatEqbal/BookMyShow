package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.HashMap;
import java.util.List;

public interface IAdminRepo {
    HashMap<Long, Movie> movies = new HashMap<>();
    HashMap<Long, List<Show>> showsOfAMovie = new HashMap<>(); //MovieId - Shows
    HashMap<Long, List<ShowSeat>> showSeatsOfAShow = new HashMap<>(); //ShowId - ShowSeat
    void addMovies(Movie movie);
    void addShows(Movie movie, List<Show> shows);
    void addSeats(Show show, List<ShowSeat> showSeats);
    Status updateShowSeat(Show show, ShowSeat showSeat);
}
