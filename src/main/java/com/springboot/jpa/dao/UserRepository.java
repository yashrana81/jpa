package com.springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.entities.User;


//Additional paramater given to declare the class for the object and type of ID
public interface UserRepository extends CrudRepository<User,Integer> {
    
}
