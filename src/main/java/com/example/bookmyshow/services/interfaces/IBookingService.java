package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.*;

import java.util.List;

public interface IBookingService {
    Status bookTicket(Show show, List<ShowSeat> showSeats, Customer user);
    Status cancelTicket(Customer user);
    Booking getBookingOfUser(User user);
}
