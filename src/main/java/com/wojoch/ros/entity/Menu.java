package com.wojoch.ros.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue
	private Integer menuId;
	
}
