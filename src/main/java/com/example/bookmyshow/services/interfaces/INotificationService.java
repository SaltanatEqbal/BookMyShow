package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.User;

import java.util.List;

public interface INotificationService {
    void confirmation(Show show, List<ShowSeat> showSeats, Customer user);
    void failureAndRetry(Customer user);
    void cancelled(Customer user);
}
