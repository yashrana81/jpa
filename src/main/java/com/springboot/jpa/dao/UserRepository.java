package com.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.jpa.entities.User;


//Additional paramater given to declare the class for the object and type of ID
public interface UserRepository extends CrudRepository<User,Integer> {
    
    // Derived query methods / Custom finder Methods

    //The signature of the function is very specific to the type of query
    // ex findByNameAndCity , findByNameOrCity , Between , LessThan , StartingWith , Containing , Like , In(with collection as parameter), etc.
    //Searh on Spring data supported keywords

    public List<User> findByName(String name);

    public List<User> findByNameOrCity(String name , String city);

    public List<User> findByNameOrderById(String name);


    //To run custom query This is hibernate/JPQL(Java persistence query language) query
    @Query("select u from User u")
    public List<User> getAllUsersCustom();

    @Query("select u from User u WHERE u.name = :n")
    //Binds the parameter name to query param n
    public List<User> getUserByName(@Param("n") String name);

    //Native/SQL Query
    @Query(value = "select * from User", nativeQuery = true)
    public List<User> getAllUsers();


    
}
