package com.example.bookmyshow.repositories;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.exceptions.PaymentNotDone;
import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repositories.interfaces.IPaymentRepo;

import java.util.HashMap;
import java.util.List;

public class PaymentRepository implements IPaymentRepo {

    HashMap<Long, Double> userPaymentAmount = new HashMap<>(); //UserId-Amount
    @Override
    public Status makePayment(double amount, Customer user) {
        Status status = Status.Success;
        try {
            userPaymentAmount.put(user.getId(), amount);
            System.out.println("Payment of " + amount + " is successfully done for user " + user.getName());
        }
        catch (Exception ex)
        {
            status = Status.Failure;
        }
        return status;
    }

    @Override
    public Status revertPayment(Customer user) {
        Status status = Status.Success;
        try {
            if(!userPaymentAmount.containsKey(user.getId()))
            {
                throw new PaymentNotDone("Payment not found");
            }
            double amount = userPaymentAmount.get(user.getId());
            userPaymentAmount.remove(user.getId());
            System.out.println("Revert Payment of " + amount + " is successfully done for user " + user.getName());
        }
        catch (Exception ex)
        {
            status = Status.Failure;
        }
        return status;
    }
}
