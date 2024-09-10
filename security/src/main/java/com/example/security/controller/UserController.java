package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.Users;
import com.example.security.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/registerUser")
	public String registerUser(@RequestBody Users user) {
		return service.registerUser(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody Users user) {
		return service.verify(user);
	}
}
