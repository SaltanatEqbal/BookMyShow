package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Customer;

public interface IUserRepo {
    void registerUser(Customer user);
    Booking getBookingByCustomer(Customer user);
}
