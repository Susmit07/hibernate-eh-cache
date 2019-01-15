package com.sapient.ehcahe.ehcachetutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.ehcahe.ehcachetutorial.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);
}
