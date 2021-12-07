package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class AuditableEntity {
    private Long id;
    private Date createdAt;
    private Date updatedAt;

    public AuditableEntity(Long id)
    {
        this.id = id;
        this.createdAt = new Date();

    }
}
