package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.user.DeliveryMan;

@Repository
public interface IDeliveryManRepository extends JpaRepository<DeliveryMan, Long>{
    
}
