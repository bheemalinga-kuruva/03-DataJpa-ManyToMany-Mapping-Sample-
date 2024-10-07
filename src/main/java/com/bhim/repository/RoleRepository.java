package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
