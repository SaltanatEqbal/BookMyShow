package com.example.bookmyshow.controllers;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.services.AdminService;
import com.example.bookmyshow.services.interfaces.IAdminService;

import java.util.List;

public class AdminController {

    private IAdminService adminService;
    public AdminController(IAdminService adminService)
    {
        this.adminService = adminService;
    }

    public void addMovie(Movie movie)
    {
        adminService.addMovies(movie);
    }

    public void addShowsOfAMovie(Movie movie, List<Show> shows)
    {
        adminService.addShows(movie, shows);
    }

    public void addSeatsOfAShow(Show show, List<ShowSeat> showSeats)
    {
        adminService.addSeats(show, showSeats);
    }
}
