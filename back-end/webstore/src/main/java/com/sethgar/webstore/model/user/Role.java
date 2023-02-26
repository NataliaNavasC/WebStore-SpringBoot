package com.sethgar.webstore.model.user;

import com.sethgar.webstore.utils.enums.RoleEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Role {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private RoleEnum name;

}
