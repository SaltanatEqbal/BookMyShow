package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.interfaces.IUserRepo;
import com.example.bookmyshow.services.interfaces.IUserService;

import java.util.List;

public class UserService implements IUserService {

    private IUserRepo userRepo;
    public UserService(IUserRepo userRepo)
    {
        this.userRepo = userRepo;
    }

    @Override
    public void registerUser(Customer user) {
        userRepo.registerUser(user);
    }

    @Override
    public Booking getBookingOfUser(Customer user) {
        return userRepo.getBookingByCustomer(user);
    }
}
