package com.bhim.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhim.model.Roles;
import com.bhim.model.User;
import com.bhim.repository.UserRepository;

@Service
public class UserServiceImpl implements Userservice {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUser() {
Roles role= new Roles();
role.setRoleName("admin");

Roles role2= new Roles();
role2.setRoleName("Manager");

User user= new User();
user.setUname("bheema");
user.setGender("male");
//set roles to user
user.setRoles(Arrays.asList(role,role2));

userRepository.save(user);

	}

}
