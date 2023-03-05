package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.product.Order;

public interface IOrderRepository extends JpaRepository<Order,Long>{
    
}
