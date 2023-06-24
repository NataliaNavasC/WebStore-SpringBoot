package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.product.ProductInShoppingCartDetail;

@Repository
public interface IProductInShoppingCartDetailRepository extends JpaRepository<ProductInShoppingCartDetail,Long>{
    
}
