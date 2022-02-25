package com.aadiminnovation.user.controller;

import java.util.List;

import com.aadiminnovation.user.entity.User;
import com.aadiminnovation.user.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PostMapping("/users/add")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.saveUsers(users);
	}
	
	@GetMapping("/users/get")
	public List<User> findAllUsers(){
		return service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User findUser(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id) {
		return service.updateUser(user, id);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	
	
}