package com.sethgar.webstore.model.dtos.productDTOs;

import org.springframework.web.multipart.MultipartFile;

import com.sethgar.webstore.model.product.Product;

public class ProductRequestDTO {
    
    private Product product;

    private MultipartFile file;

}
