package com.sapient.ehcahe.ehcachetutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.ehcahe.ehcachetutorial.cache.UsersCacheService;
import com.sapient.ehcahe.ehcachetutorial.model.Users;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {

	@Autowired
	UsersCacheService usersCacheService;

	@GetMapping(value = "/{name}")
	public Users getUser(@PathVariable final String name) {
		return usersCacheService.getUser(name);
	}
}
