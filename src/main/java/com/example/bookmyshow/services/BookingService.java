package com.example.bookmyshow.services;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repositories.interfaces.IBookingRepo;
import com.example.bookmyshow.services.interfaces.IBookingService;
import com.example.bookmyshow.services.interfaces.ICostCalculationStrategy;
import com.example.bookmyshow.services.interfaces.INotificationService;
import com.example.bookmyshow.services.interfaces.IPaymentService;

import java.util.List;

public class BookingService implements IBookingService {

    private IBookingRepo bookingRepo;
    private ICostCalculationStrategy costCalculationStrategy;
    private IPaymentService paymentService;

    public final static Object lock = new Object();

    public BookingService(IBookingRepo bookingRepo, ICostCalculationStrategy costCalculationStrategy,
        IPaymentService paymentService)
    {
        this.bookingRepo = bookingRepo;
        this.costCalculationStrategy = costCalculationStrategy;
        this.paymentService = paymentService;
    }

    @Override
    public Status bookTicket(Show show, List<ShowSeat> showSeats, Customer user) {
        //Cost calculation
        double amount = costCalculationStrategy.amountCalculation(showSeats);
        //Update seat status of User
        Status status = Status.Success;
        // Lock entire class unless 1 booking is done.
        // Pessimistic lock on DB. Lock DB for both read and write.
        synchronized (lock) {
            status = updateUserShowSeat(show, showSeats, user);
            //Payment
            if (status == Status.Success) {
                status = paymentService.makePayment(show, showSeats, amount, user);
            }
        }

        return status;
    }

    @Override
    public Status cancelTicket(Customer user) {
        Status status = bookingRepo.cancelTicket(user);
        if(status == Status.Success)
        {
            status = paymentService.revertPayment(user);
        }
        return status;
    }

    @Override
    public Booking getBookingOfUser(User user) {
        return bookingRepo.getBookingOfUser(user);
    }

    private Status updateUserShowSeat(Show show, List<ShowSeat> showSeats, Customer user) {
        Status status = Status.Success;
        try {
            for (ShowSeat showSeat: showSeats) {
                status = bookingRepo.updateSeatStatus(show, showSeat);
                if(status == Status.Failure) break;
            }
            if(status == Status.Success)
            {
                status = bookingRepo.bookTicket(show, showSeats, user);
            }
        }
        catch (Exception ex)
        {
            status = Status.Failure;
        }
        return status;
    }
}
