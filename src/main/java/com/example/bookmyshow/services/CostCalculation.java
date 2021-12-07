package com.example.bookmyshow.services;

import com.example.bookmyshow.enums.SeatType;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.services.interfaces.ICostCalculationStrategy;

import java.util.List;

public class CostCalculation implements ICostCalculationStrategy {
    @Override
    public double amountCalculation(List<ShowSeat> showSeats) {
        double amount = 0;
        for (ShowSeat showSeat: showSeats) {
            amount += SeatCost(showSeat.getSeatType());
        }
        return amount;
    }

    private double SeatCost(SeatType seatType)
    {
        double amount = 0;
        if(seatType == SeatType.FrontRow)
        {
            amount = 300;
        }
        else if(seatType == SeatType.FrontRow)
        {
            amount = 500;
        }
        else if(seatType == SeatType.FrontRow)
        {
            amount = 800;
        }
        return amount;
    }
}
