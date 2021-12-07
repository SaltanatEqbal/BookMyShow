package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;

import java.util.List;

public interface IShowRepo {
    List<Show> getAllShowsOfMovie(Movie movie);
}
