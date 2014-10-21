package com.wojoch.ros.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wojoch.ros.repository.DessertRepository;
import com.wojoch.ros.repository.DrinkRepository;
import com.wojoch.ros.repository.ItemRepository;
import com.wojoch.ros.repository.MainCourseRepository;
import com.wojoch.ros.repository.MenuRepository;
import com.wojoch.ros.repository.OrderRepository;
import com.wojoch.ros.repository.RoleRepository;
import com.wojoch.ros.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
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
