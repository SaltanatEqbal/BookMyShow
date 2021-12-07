package com.example.bookmyshow.repositories;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.exceptions.MovieAlreadyExists;
import com.example.bookmyshow.exceptions.SeatAlreadyBooked;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.IAdminRepo;

import java.util.*;

public class AdminRepository implements IAdminRepo {
    @Override
    public void addMovies(Movie movie) {
        if(movies.containsKey(movie.getId()))
        {
            throw new MovieAlreadyExists("Movie Already exists");
        }
        movies.put(movie.getId(), movie);
    }

    @Override
    public void addShows(Movie movie, List<Show> shows) {
        if(showsOfAMovie.containsKey(movie.getId()))
        {
            showsOfAMovie.get(movie.getId()).addAll(shows);
        }
        else
        {
            showsOfAMovie.put(movie.getId(), shows);
        }
    }

    @Override
    public void addSeats(Show show, List<ShowSeat> showSeats) {
        if(showSeatsOfAShow.containsKey(show.getId()))
        {
            showSeatsOfAShow.get(show.getId()).addAll(showSeats);
        }
        else
        {
            showSeatsOfAShow.put(show.getId(), showSeats);
        }
    }

    @Override
    public Status updateShowSeat(Show show, ShowSeat showSeat) {
        Status status;
        List<ShowSeat> showSeats = showSeatsOfAShow.get(show.getId());
        int showSeatId = showSeat.getId().intValue();
        Status seatStatus = showSeats.get(showSeatId).getStatus();
        try {
            if(seatStatus == Status.Occupied)
            {
                throw new SeatAlreadyBooked("Seat already booked");
            }
            else
            {
                showSeats.get(showSeatId).setStatus(Status.Occupied);
                showSeatsOfAShow.put(show.getId(), showSeats);
                status = Status.Success;
            }
        }
        catch (Exception ex)
        {
            status = Status.Failure;
        }

        return status;
    }
}
