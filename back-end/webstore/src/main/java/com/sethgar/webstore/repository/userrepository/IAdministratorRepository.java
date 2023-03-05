package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.user.Administrator;

public interface IAdministratorRepository extends JpaRepository<Administrator,Long>{
    
}
