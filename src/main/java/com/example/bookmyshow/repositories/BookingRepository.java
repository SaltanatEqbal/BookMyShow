package com.example.bookmyshow.repositories;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.exceptions.NoBookingExists;
import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repositories.interfaces.IBookingRepo;
import com.example.bookmyshow.repositories.interfaces.ICheckAvailabilityRepo;

import java.util.HashMap;
import java.util.List;

public class BookingRepository implements IBookingRepo {

    HashMap<Long, Booking> userBooking = new HashMap<>(); //UserId-Booking

    private ICheckAvailabilityRepo checkAvailabilityRepo;
    public BookingRepository(ICheckAvailabilityRepo checkAvailabilityRepo)
    {
        this.checkAvailabilityRepo = checkAvailabilityRepo;
    }

    @Override
    public Status bookTicket(Show show, List<ShowSeat> showSeats, Customer user) {
        Booking booking = new Booking(show, showSeats);
        userBooking.put(user.getId(), booking);
        return Status.Success;
    }

    @Override
    public Booking getBookingOfUser(User user) {
        return userBooking.get(user.getId());
    }

    @Override
    public Status cancelTicket(User user) {
        Status status = Status.Success;
        try {
            if(userBooking.containsKey(user.getId()))
            {
                userBooking.remove(user.getId());
            }
            else
            {
                throw new NoBookingExists("No booking exists for user");
            }
        }
        catch (Exception ex)
        {
            status = Status.Failure;
        }
        return status;
    }

    @Override
    public Status updateSeatStatus(Show show, ShowSeat showSeat) {
        return checkAvailabilityRepo.updateShowSeat(show,showSeat);
    }
}
