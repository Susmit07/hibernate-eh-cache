package com.sapient.ehcahe.ehcachetutorial.cache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.sapient.ehcahe.ehcachetutorial.model.Users;
import com.sapient.ehcahe.ehcachetutorial.repository.UsersRepository;

@Component
public class UsersCacheService {

	@Autowired
	UsersRepository usersRepository;

	@Cacheable(value = "usersCache", key = "#name")
	public Users getUser(String name) {
		System.out.println("Retrieving from Database for name: " + name);
		return usersRepository.findByName(name);
	}
}
