package com.sethgar.webstore.repository.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.product.ProductInOrderDetail;

public interface IProductInOrderDetailRepository extends JpaRepository<ProductInOrderDetail,Long>{
    
}
