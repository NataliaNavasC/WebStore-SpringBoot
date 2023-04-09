package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sethgar.webstore.model.user.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long>{

}