package com.spring.testjwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.testjwt.model.DAOUser;


public interface UserDao extends JpaRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
	
}