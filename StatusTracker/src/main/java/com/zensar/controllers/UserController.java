package com.zensar.controllers;

import java.util.List;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import entities.User;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") int userId) {
		return userService.findUserById(userId);
	}

	@PostMapping("/user/add")
	public String add(@RequestBody User user) {
		userService.addUser(user);
		return "new User" + user.getUser_id() + "is added succesfully";
	}

	@PutMapping("/user/update")
	public String update(@RequestBody User user) {
		userService.updateUser(user);
		return "new User" + user.getUser_id() + "is updated succesfully";
	}
	
	@DeleteMapping("/user/delete")
	public String delete(@RequestBody User user) {
		userService.deleteUser(user);
		return "new User" + user.getUser_id() + "is deleted succesfully";
	}
}

