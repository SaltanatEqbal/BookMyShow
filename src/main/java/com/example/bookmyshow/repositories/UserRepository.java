package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.interfaces.IBookingRepo;
import com.example.bookmyshow.repositories.interfaces.IUserRepo;

import java.util.HashMap;

public class UserRepository implements IUserRepo {

    HashMap<Long, User> userList = new HashMap<>();
    private IBookingRepo bookingRepo;
    public UserRepository(IBookingRepo iBookingRepo)
    {
        this.bookingRepo = iBookingRepo;
    }

    @Override
    public void registerUser(Customer user) {
        userList.put(user.getId(), user);
    }

    @Override
    public Booking getBookingByCustomer(Customer user) {
        return bookingRepo.getBookingOfUser(user);
    }
}
