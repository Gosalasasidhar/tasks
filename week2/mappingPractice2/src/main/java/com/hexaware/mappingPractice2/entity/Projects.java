package com.hexaware.mappingPractice2.entity;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Projects {
	
	@Id
	private int projectId;
	private String title;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String referenceLink;
	private String hostedlink;
	public Projects(int projectId,String title, String description, LocalDate startDate, LocalDate endDate, String referenceLink,
			String hostedlink) {
		super();
		this.projectId=projectId;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.referenceLink = referenceLink;
		this.hostedlink = hostedlink;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getReferenceLink() {
		return referenceLink;
	}
	public void setReferenceLink(String referenceLink) {
		this.referenceLink = referenceLink;
	}
	public String getHostedlink() {
		return hostedlink;
	}
	public void setHostedlink(String hostedlink) {
		this.hostedlink = hostedlink;
	}
	
	
	
	
	

}