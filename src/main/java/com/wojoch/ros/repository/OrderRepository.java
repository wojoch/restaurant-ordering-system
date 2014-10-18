package com.wojoch.ros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojoch.ros.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
