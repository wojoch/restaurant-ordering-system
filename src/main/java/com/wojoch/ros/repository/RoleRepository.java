package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String login);
}
