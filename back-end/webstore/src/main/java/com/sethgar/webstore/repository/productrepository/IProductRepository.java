package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.product.Product;

public interface IProductRepository extends JpaRepository<Product,Long> {
    
}
