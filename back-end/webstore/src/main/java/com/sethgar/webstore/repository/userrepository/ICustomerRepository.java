package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.user.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Long>{
    
}
