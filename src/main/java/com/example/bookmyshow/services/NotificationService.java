package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.interfaces.INotificationRepo;
import com.example.bookmyshow.services.interfaces.INotificationService;

import java.util.List;

public class NotificationService implements INotificationService {

    private INotificationRepo notificationRepo;
    public NotificationService(INotificationRepo notificationRepo)
    {
        this.notificationRepo = notificationRepo;
    }

    @Override
    public void confirmation(Show show, List<ShowSeat> showSeats, Customer user) {
        notificationRepo.confirmation(show,showSeats,user);
    }

    @Override
    public void failureAndRetry(Customer user) {
        notificationRepo.failureAndRetry(user);
    }

    @Override
    public void cancelled(Customer user) {
        notificationRepo.cancelled(user);
    }
}
