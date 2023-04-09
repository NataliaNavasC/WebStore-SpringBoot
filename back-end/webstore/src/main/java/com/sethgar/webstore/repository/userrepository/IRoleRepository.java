package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.user.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{
    
}
