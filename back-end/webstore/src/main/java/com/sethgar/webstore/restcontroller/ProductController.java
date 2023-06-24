package com.sethgar.webstore.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sethgar.webstore.model.dtos.productDTOs.ProductDTO;
import com.sethgar.webstore.model.product.Product;
import com.sethgar.webstore.service.interfaces.IProductService;
import com.sethgar.webstore.utils.general.DtoConverter;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    
    @Autowired
    private IProductService productService;

    @Autowired
    private DtoConverter dtoConverter;

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO){
        try{
            return this.dtoConverter.entityToDto(this.productService.createProduct(this.dtoConverter.dtoToEntity(productDTO, Product.class)), ProductDTO.class);
        }
        catch(Exception e){
            // TODO: handle exception
            return null;
        }
    }

    @GetMapping(value = "/{id}")
    public ProductDTO getProductById(@PathVariable Long id){
        return this.dtoConverter.entityToDto(this.productService.getProductById(id), ProductDTO.class);
    }
}
