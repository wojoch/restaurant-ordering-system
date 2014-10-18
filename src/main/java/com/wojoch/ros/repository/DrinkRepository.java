package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Integer>{

}
