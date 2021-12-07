package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class HallSeat extends AuditableEntity{
    private Hall hall;
    private List<ShowSeat> showSeats;

    public HallSeat(Long id, Hall hall)
    {
        super(id);
        this.hall = hall;
        this.showSeats = new ArrayList<>();
    }
}
