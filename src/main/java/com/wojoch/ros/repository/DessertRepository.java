package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.Dessert;

public interface DessertRepository extends JpaRepository<Dessert, Integer>{

}
