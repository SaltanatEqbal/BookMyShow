package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.IAdminRepo;
import com.example.bookmyshow.services.interfaces.IAdminService;

import java.util.List;

public class AdminService implements IAdminService {

    private IAdminRepo adminRepo;
    public AdminService(IAdminRepo adminRepo)
    {
        this.adminRepo = adminRepo;
    }
    @Override
    public void addMovies(Movie movie) {
        this.adminRepo.addMovies(movie);
    }

    @Override
    public void addShows(Movie movie, List<Show> shows) {
        this.adminRepo.addShows(movie,shows);
    }

    @Override
    public void addSeats(Show show, List<ShowSeat> showSeats) {
        this.adminRepo.addSeats(show,showSeats);
    }
}
