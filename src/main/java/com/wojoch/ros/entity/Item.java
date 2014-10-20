package com.wojoch.ros.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
/*	public Double getPrice();
	public String getName();
	public String getDescription();
*/}
