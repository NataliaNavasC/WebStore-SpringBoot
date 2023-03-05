package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.user.Role;

public interface IRoleRepository extends JpaRepository<Role, Long>{
    
}
