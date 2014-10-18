package com.wojoch.ros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wojoch.ros.repository.RoleRepository;
import com.wojoch.ros.repository.UserRepository;

@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
}
