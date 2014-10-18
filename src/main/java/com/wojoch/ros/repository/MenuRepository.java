package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{

}
