package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
