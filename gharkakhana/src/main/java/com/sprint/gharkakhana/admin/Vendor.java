package com.sprint.gharkakhana.admin;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Vendor {
	@Id
	@GeneratedValue
	private int vid;
	private String vname;
	private List<foodItems> foodItems;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public List<foodItems> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<foodItems> foodItems) {
		this.foodItems = foodItems;
	}

}
