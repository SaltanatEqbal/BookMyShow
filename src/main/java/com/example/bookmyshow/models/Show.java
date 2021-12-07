package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends AuditableEntity{
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private Hall hall;
    private List<ShowSeat> showSeats;
    private List<Booking> bookings;

    public Show(Long id, Date startTime, Date endTime, Movie movie, Hall hall)
    {
        super(id);
        this.startTime = startTime;
        this.endTime = endTime;
        this.movie = movie;
        this.hall = hall;
        this.showSeats = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }
}
