package com.sethgar.webstore.model.product;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ShoppingCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "shoppingCart", orphanRemoval = true)
    private List<ProductInShoppingCartDetail> products;

        
    //----------------------------GETTERS AND SETTERS----------------------------//
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ProductInShoppingCartDetail> getProducts() {
        return products;
    }

    public void setProducts(List<ProductInShoppingCartDetail> products) {
        this.products = products;
    }


    
}
