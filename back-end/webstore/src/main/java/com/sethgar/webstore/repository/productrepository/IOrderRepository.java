package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.product.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Long>{
    
}
