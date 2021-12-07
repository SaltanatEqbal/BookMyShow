package com.example.bookmyshow.controllers;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.*;
import com.example.bookmyshow.services.BookingService;
import com.example.bookmyshow.services.interfaces.IBookingService;

import java.util.List;

public class BookingController {

    private IBookingService bookingService;
    public BookingController(IBookingService bookingService)
    {
        this.bookingService = bookingService;
    }

    public Status bookTicket(Show show, List<ShowSeat> showSeats, Customer user)
    {
        return bookingService.bookTicket(show, showSeats, user);
    }

    public Status cancelTicket(Customer user)
    {
        return bookingService.cancelTicket(user);
    }
}
