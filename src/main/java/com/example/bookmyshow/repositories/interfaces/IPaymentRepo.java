package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface IPaymentRepo {
    Status makePayment(double amount, Customer user);
    Status revertPayment(Customer user);
}