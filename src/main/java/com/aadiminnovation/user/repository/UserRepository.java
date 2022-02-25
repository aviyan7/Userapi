package com.aadiminnovation.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadiminnovation.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
