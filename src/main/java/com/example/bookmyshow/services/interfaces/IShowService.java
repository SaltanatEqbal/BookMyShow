package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;

import java.util.List;

public interface IShowService {
    List<Show> getAllShowsOfMovie(Movie movie);
}
