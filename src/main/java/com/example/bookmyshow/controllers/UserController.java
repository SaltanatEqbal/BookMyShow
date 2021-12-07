package com.example.bookmyshow.controllers;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.services.interfaces.IUserService;
import com.sun.source.tree.LambdaExpressionTree;

public class UserController {

    private IUserService userService;
    public UserController(IUserService userService)
    {
        this.userService = userService;
    }

    public void registerUser(Customer customer)
    {
        userService.registerUser(customer);
    }

    public Booking getBookingOfCustomer(Customer customer)
    {
        return userService.getBookingOfUser(customer);
    }
}
