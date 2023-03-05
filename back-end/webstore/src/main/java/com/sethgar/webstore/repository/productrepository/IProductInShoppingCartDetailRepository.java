package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.product.ProductInShoppingCartDetail;

public interface IProductInShoppingCartDetailRepository extends JpaRepository<ProductInShoppingCartDetail,Long>{
    
}
