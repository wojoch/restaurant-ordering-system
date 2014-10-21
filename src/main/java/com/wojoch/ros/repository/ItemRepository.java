package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
