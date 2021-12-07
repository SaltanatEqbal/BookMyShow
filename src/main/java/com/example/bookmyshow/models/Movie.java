package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Movie extends AuditableEntity {
    private String name;
    private List<Show> shows;

    public Movie(Long id, String name)
    {
        super(id);
        this.name = name;
        this.shows = new ArrayList<>();
    }
}
