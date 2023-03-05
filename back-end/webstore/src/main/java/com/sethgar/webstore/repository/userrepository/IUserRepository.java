package com.sethgar.webstore.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sethgar.webstore.model.user.User;

public interface IUserRepository extends JpaRepository<User,Long>{

}