package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Hall extends AuditableEntity{
    private Theatre theatre;
    private List<Show> shows;
    private List<HallSeat> hallSeats;

    public Hall(Long id, Theatre theatre)
    {
        super(id);
        this.theatre = theatre;
        this.shows = new ArrayList<>();
        this.hallSeats = new ArrayList<>();
    }
}
