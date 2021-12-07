package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.interfaces.INotificationRepo;

import java.util.List;

public class NotificationRepository implements INotificationRepo {
    @Override
    public void confirmation(Show show, List<ShowSeat> showSeats, Customer user) {
        System.out.println(showSeats.size() + " tickets of movie " + show.getMovie().getName()
            + " of timing " + show.getStartTime() + "is booked. Confirmation is sent to user no"
            + user.getPhoneNo());
    }

    @Override
    public void failureAndRetry(Customer user) {
        System.out.println("Retry payment to " + user.getPhoneNo());
    }

    @Override
    public void cancelled(Customer user) {
        System.out.println("Ticket is cancelled and amount is credited back to user no "+
                + user.getPhoneNo());
    }
}
