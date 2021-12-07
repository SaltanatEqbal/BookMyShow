package com.example.bookmyshow.repositories;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.IAdminRepo;
import com.example.bookmyshow.repositories.interfaces.ICheckAvailabilityRepo;

import java.util.List;
import java.util.stream.Collectors;

public class CheckAvailability implements ICheckAvailabilityRepo {
    private IAdminRepo adminRepository;
    public CheckAvailability(IAdminRepo iAdminRepo)
    {
        this.adminRepository = iAdminRepo;
    }

    @Override
    public List<Movie> getAllMovies() {
        return adminRepository.movies.values().stream().collect(Collectors.toList());
    }

    @Override
    public List<Show> getAllShowsForAMovie(Movie movie) {
        return adminRepository.showsOfAMovie.get(movie.getId());
    }

    @Override
    public List<ShowSeat> getAllShowSeat(Show show) {
        return adminRepository.showSeatsOfAShow.get(show.getId());
    }

    @Override
    public Status updateShowSeat(Show show, ShowSeat showSeat) {
        return adminRepository.updateShowSeat(show,showSeat);
    }
}
