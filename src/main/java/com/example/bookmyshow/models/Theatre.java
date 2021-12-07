package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Theatre extends AuditableEntity{
    private String name;
    private String address;
    private List<Hall> halls;

    public Theatre(Long id, String name, String address)
    {
        super(id);
        this.name = name;
        this.address = address;
        this.halls = new ArrayList<>();
    }

}
