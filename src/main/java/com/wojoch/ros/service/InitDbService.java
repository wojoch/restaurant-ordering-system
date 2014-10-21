package com.wojoch.ros.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.wojoch.ros.repository.DessertRepository;
import com.wojoch.ros.repository.DrinkRepository;
import com.wojoch.ros.repository.ItemRepository;
import com.wojoch.ros.repository.MainCourseRepository;
import com.wojoch.ros.repository.MenuRepository;
import com.wojoch.ros.repository.OrderRepository;
import com.wojoch.ros.repository.RoleRepository;
import com.wojoch.ros.repository.UserRepository;
import com.wojoch.ros.entity.Role;
import com.wojoch.ros.entity.User;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {
			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);
			
			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);
			
			User userAdmin = new User();
			userAdmin.setLogin("admin");
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			userAdmin.setPassword(encoder.encode("admin"));
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleAdmin);
			roles.add(roleUser);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);
	}


			@Autowired
			private OrderRepository orderRepository;

			@Autowired
			private MenuRepository menuRepository;

			@Autowired
			private ItemRepository itemRepository;

			@Autowired
			private MainCourseRepository mainCourseRepository;

			@Autowired
			private DessertRepository dessertRepository;

			@Autowired
			private DrinkRepository drinkRepository;


		}
