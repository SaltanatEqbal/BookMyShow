package com.example.bookmyshow.services;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.IPaymentRepo;
import com.example.bookmyshow.services.interfaces.INotificationService;
import com.example.bookmyshow.services.interfaces.IPaymentService;

import java.util.List;

public class PaymentService implements IPaymentService {

    private IPaymentRepo paymentRepo;
    private INotificationService notificationService;
    public PaymentService(IPaymentRepo paymentRepo, INotificationService notificationService)
    {
        this.paymentRepo = paymentRepo;
        this.notificationService = notificationService;
    }
    @Override
    public Status makePayment(Show show, List<ShowSeat> showSeats, double amount, Customer user) {
        Status status = paymentRepo.makePayment(amount, user);
        if(status == Status.Success)
        {
            notificationService.confirmation(show, showSeats, user);
        }
        else {
            notificationService.failureAndRetry(user);
        }
        return status;
    }

    @Override
    public Status revertPayment(Customer user) {
        Status status = paymentRepo.revertPayment(user);
        notificationService.cancelled(user);
        return status;
    }
}
