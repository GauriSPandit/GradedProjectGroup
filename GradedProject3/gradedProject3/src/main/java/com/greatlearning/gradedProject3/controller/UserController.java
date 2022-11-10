package com.greatlearning.gradedProject3.controller;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.gradedProject3.entity.Employee;
import com.greatlearning.gradedProject3.entity.Role;
import com.greatlearning.gradedProject3.entity.User;
import com.greatlearning.gradedProject3.repository.UserRepository;

import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/userManagement")

public class UserController {
	@Autowired 
	UserRepository userRepository;
	
	@PostMapping("/addUser")
	public User saveUser(@RequestBody User user) {
		user.setId((long) 0);
		return userRepository.save(user);
	}
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
}
