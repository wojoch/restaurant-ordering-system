package com.wojoch.ros.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("MainCourse")
public class MainCourse extends Item{
	
	private enum Cuisines {
		Polish, Mexican, Italian;
	}

}
