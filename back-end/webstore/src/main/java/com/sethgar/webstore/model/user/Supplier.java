package com.sethgar.webstore.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Supplier extends User{

    @Column(nullable = false)
    private String address;

    
}
