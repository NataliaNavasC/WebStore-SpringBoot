package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.product.ProductInOrderDetail;

@Repository
public interface IProductInOrderDetailRepository extends JpaRepository<ProductInOrderDetail,Long>{
    
}
