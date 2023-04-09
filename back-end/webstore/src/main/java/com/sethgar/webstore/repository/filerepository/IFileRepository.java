package com.sethgar.webstore.repository.filerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.files.FileDB;

@Repository
public interface IFileRepository extends JpaRepository<FileDB,Long>{
    
}
