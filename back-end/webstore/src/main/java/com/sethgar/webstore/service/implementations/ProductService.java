package com.sethgar.webstore.service.implementations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.sethgar.webstore.model.files.FileDB;
import com.sethgar.webstore.model.product.Product;
import com.sethgar.webstore.repository.filerepository.IFileRepository;
import com.sethgar.webstore.repository.productrepository.IProductRepository;
import com.sethgar.webstore.service.interfaces.IProductService;

@Service
public class ProductService implements IProductService{
    
    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IFileRepository fileRepository;

    @Override
    public Product createProduct(Product product) throws Exception{
        try {
            return this.productRepository.save(product);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void createProductsFromFile(MultipartFile file) {
        List<String> results = new ArrayList<>();
        
        try {
            // Save file
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            FileDB fileDB = new FileDB();
            fileDB.setName(fileName);
            fileDB.setExtension(file.getContentType());
            fileDB.setData(file.getBytes());       
            this.fileRepository.save(fileDB);

            // Read file
            try{
                File tempFile = new File(System.getProperty("java.io.tmpdir"));
                OutputStream os = new FileOutputStream(tempFile);
                os.write(fileDB.getData());
                FileReader fr = new FileReader(tempFile);
                BufferedReader br = new BufferedReader(fr);
                String line = " ";
                while ((line = br.readLine()) != null) {
                    
                }
            }
            catch(Exception e){

            }

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Product getProductById(long id) {
        return this.productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public Boolean deleteProduct(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

    @Override
    public void deleteProductsFromFile(MultipartFile file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductsFromFile'");
    }

    

}
