package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.user.Supplier;

public interface ISupplierRepository extends JpaRepository<Supplier,Long>{
    
}
