package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.product.ShoppingCart;

public interface IShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
    
}
