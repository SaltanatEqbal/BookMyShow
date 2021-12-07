package com.example.bookmyshow.repositories.interfaces;

import com.example.bookmyshow.enums.Status;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface ISeatRepo {
    List<ShowSeat> getAllSeat(Show show);
}
