package com.hexaware.finalProjectDemo2.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class workExperience {

	@Id
	private String Company;
	private String designation;
	private LocalDate start_date;
	private LocalDate end_date;
	private double salary;
	public workExperience() {
		super();
	}
	public workExperience(String company, String designation, LocalDate start_date, LocalDate end_date, double salary) {
		super();
		this.Company = company;
		this.designation = designation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.salary = salary;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		this.Company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "workExperience [Company=" + Company + ", designation=" + designation + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
