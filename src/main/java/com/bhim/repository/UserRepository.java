package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
