package com.example.bookmyshow.services.interfaces;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;

import java.util.List;

public interface ISeatService {
    List<ShowSeat> getAllSeat(Show show);
}
