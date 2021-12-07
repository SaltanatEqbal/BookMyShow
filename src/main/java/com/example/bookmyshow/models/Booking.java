package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends AuditableEntity{
    private static Long idGenerated = 0L;
    private Show show;
    private List<ShowSeat> showSeats;
    private int amountPaid = 0;

    public Booking(Show show, List<ShowSeat> showSeats)
    {
        super(idGenerated++);
        this.show = show;
        this.showSeats = showSeats;
    }
}
