package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.user.DeliveryMan;

public interface IDeliveryManRepository extends JpaRepository<DeliveryMan, Long>{
    
}
