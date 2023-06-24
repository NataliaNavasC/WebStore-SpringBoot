package com.sethgar.webstore.service.interfaces;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.sethgar.webstore.model.product.Product;

public interface IProductService {
    
    public Product createProduct(Product product) throws Exception;

    public void createProductsFromFile(MultipartFile file);

    public Product getProductById(long id);

    public Product updateProduct(Product product);

    public Boolean deleteProduct(long id);

    public void deleteProductsFromFile(MultipartFile file);
}
