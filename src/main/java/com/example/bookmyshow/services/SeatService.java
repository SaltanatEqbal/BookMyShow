package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.ISeatRepo;
import com.example.bookmyshow.services.interfaces.ISeatService;

import java.util.List;

public class SeatService implements ISeatService {

    private ISeatRepo seatRepo;
    public SeatService(ISeatRepo seatRepo)
    {
        this.seatRepo = seatRepo;
    }

    @Override
    public List<ShowSeat> getAllSeat(Show show) {
        return seatRepo.getAllSeat(show);
    }
}
