package com.example.bookmyshow.repositories;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.ICheckAvailabilityRepo;
import com.example.bookmyshow.repositories.interfaces.ISeatRepo;

import java.util.List;

public class SeatRepository implements ISeatRepo {

    private ICheckAvailabilityRepo checkAvailability;
    public SeatRepository(ICheckAvailabilityRepo iCheckAvailability)
    {
        this.checkAvailability = iCheckAvailability;
    }

    @Override
    public List<ShowSeat> getAllSeat(Show show) {
        return this.checkAvailability.getAllShowSeat(show);
    }

}
