package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.*;

import java.util.HashMap;
import java.util.List;

public interface IBookingRepo {
    Status bookTicket(Show show, List<ShowSeat> showSeats, Customer user);
    Booking getBookingOfUser(User user);
    Status cancelTicket(User user);
    Status updateSeatStatus(Show show, ShowSeat showSeat);
}
