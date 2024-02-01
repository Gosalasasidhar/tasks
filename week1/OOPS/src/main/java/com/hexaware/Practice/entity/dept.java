package com.hexaware.Practice.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dept {
	private int dno;
	private String dname;
	private String location;
	
	public dept()
	{
		super();
	}
	public dept(int dno, String dname, String location) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "dept [dno=" + dno + ", dname=" + dname + ", location=" + location + "]";
	}
}
