package com.wojoch.ros.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public interface Item {
	public Double getPrice();
	public String getName();
	public String getDescription();
}
