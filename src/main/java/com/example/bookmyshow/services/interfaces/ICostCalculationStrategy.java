package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface ICostCalculationStrategy {
    double amountCalculation(List<ShowSeat> showSeats);
}
