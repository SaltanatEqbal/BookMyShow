package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface IPaymentService {
    Status makePayment(Show show, List<ShowSeat> showSeats, double amount, Customer user);
    Status revertPayment(Customer user);
}
