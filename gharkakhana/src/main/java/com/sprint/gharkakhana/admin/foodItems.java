package com.sprint.gharkakhana.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class foodItems 
{
	@Id
	@GeneratedValue
	private int fid;
	private String fname;
	private int fquantity;
	private int fcost;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFquantity() {
		return fquantity;
	}
	public void setFquantity(int fquantity) {
		this.fquantity = fquantity;
	}
	public int getFcost() {
		return fcost;
	}
	public void setFcost(int fcost) {
		this.fcost = fcost;
	}

}
