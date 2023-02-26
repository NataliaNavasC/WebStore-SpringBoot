package com.sethgar.webstore.model.user;

import java.util.List;

import com.sethgar.webstore.model.product.Order;
import com.sethgar.webstore.model.product.ShoppingCart;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer extends User {

    @Column(nullable = false)
    private String address;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, optional = false, orphanRemoval = true)
    private ShoppingCart shoppingCart;

    
    //---------------------------- GETTERS AND SETTERS ----------------------------//
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    

}
