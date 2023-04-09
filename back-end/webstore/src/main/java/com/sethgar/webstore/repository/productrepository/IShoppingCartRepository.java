package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.product.ShoppingCart;

@Repository
public interface IShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
    
}
