package com.sethgar.webstore.model.dtos.userDTOs;

import com.sethgar.webstore.utils.enums.RoleEnum;

public class RoleDTO {
    
    private long id;
    
    private RoleEnum name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public RoleEnum getName() {
        return name;
    }

    public void setName(RoleEnum name) {
        this.name = name;
    }

    
}
