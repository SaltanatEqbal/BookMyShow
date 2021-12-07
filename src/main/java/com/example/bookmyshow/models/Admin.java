package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin extends User{
    private boolean permission;

    public Admin(Long id, String name, String email, int phoneNo)
    {
        super(id,name,email,phoneNo);
        this.permission = true;
    }
}
