package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User extends AuditableEntity{
    private String name;
    private String password;
    private String email;
    private int phoneNo;

    public User(Long id, String name, String email, int phoneNo)
    {
        super(id);
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }
}
