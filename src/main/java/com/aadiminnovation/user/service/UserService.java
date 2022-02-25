package com.aadiminnovation.user.service;

import java.util.List;
import java.util.Optional;

import com.aadiminnovation.user.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadiminnovation.user.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> saveUsers(List<User> users) {
		return repository.saveAll(users);
	}

	public List<User> getUsers() {
		return repository.findAll();
	}

	public User getUserById(int id) {
		return repository.findById(id).orElse(null);
	}

	public User getUserByName(String name) {
		return repository.findByName(name);
	}

	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User removed!" + id;
	}

	public User updateUser(User user, int id) {
		Optional<User> existingUser = repository.findById(id);
		if (existingUser.isPresent()) {
			User person = existingUser.get();
			person.setName(user.getName());
			person.setEmail(user.getEmail());
			return repository.save(person);
		}
		return null;
	}

}