package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.User;

import java.util.List;

public interface IUserService {
    void registerUser(Customer user);
    Booking getBookingOfUser(Customer user);
}
