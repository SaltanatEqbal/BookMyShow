package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatType;
import com.example.bookmyshow.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends AuditableEntity{
    private Show show;
    private HallSeat hallSeat;
    private SeatType seatType;
    private Status status;

    public ShowSeat(Long id, Show show, HallSeat hallSeat)
    {
        super(id);
        this.show = show;
        this.hallSeat = hallSeat;
    }
}
