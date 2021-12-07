package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends User{

    private Booking booking;
    private double amount;
    public Customer(Long id, String name, String email, int phoneNo)
    {
        super(id,name,email,phoneNo);
    }
}
