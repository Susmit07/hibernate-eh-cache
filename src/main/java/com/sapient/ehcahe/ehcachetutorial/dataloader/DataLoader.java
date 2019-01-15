package com.sapient.ehcahe.ehcachetutorial.dataloader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.ehcahe.ehcachetutorial.model.Users;
import com.sapient.ehcahe.ehcachetutorial.repository.UsersRepository;

@Component
public class DataLoader {

	@Autowired
	UsersRepository usersRepository;

	@PostConstruct
	public void load() {
		List<Users> usersList = getList();
		usersRepository.save(usersList);
	}

	public List<Users> getList() {
		List<Users> usersList = new ArrayList<>();
		usersList.add(new Users("Susmit", "Tech",123L));
		usersList.add(new Users("Suraj", "Tech",13L));
		return usersList;
	}
}
