package com.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(JpaApplication.class, args);
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);


		//Adding multiple users returns interable type of object

		//To create user
		// User user =new User();
		// user.setCity("city2"); user.setName("name2"); user.setStatus("status2");
		// User user2 = new User();
		// user2.setCity("city3"); user2.setName("name3"); user2.setStatus("status3");
		// User user3 = new User();
		// user3.setCity("city4"); user3.setName("name4"); user3.setStatus("status4");
		
		// Iterable<User> ListofUsers = List.of(user,user2,user3);
		// Iterable<User> resultUser = userRepository.saveAll(ListofUsers);
		// System.out.println(resultUser);

		//To update user using Id
		// Optional<User> optional = userRepository.findById(52);
		// User user2 = optional.get();
		// user2.setName("updated name");
		// User result2 = userRepository.save(user2);
		// System.out.println(result2);

		//TO delete user

		// userRepository.delete(result2);
		// Iterable<Integer> ids = List.of(52,102);
		// Iterable<User> listOfUsers = userRepository.findAllById(ids);
		// userRepository.deleteAll(listOfUsers);
		
		List<User>users = userRepository.getUserByName("name2");
		System.out.println(users);


	}

}
