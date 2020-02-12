package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author Sushma Kumari
 * @creation_date 11th Feb 2020 11:30
 * */

@Entity
public class Jira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jiraId;
	
	@OneToOne(mappedBy = "jira")
	@JoinColumn(name = "userId")
	private User createdBy;
	
	@OneToOne(mappedBy = "jira")
	@JoinColumn(name = "userId")
	private User assignedTo;
	
	@Column(nullable = false, updatable = true)
	private String description;
	
	@Column(nullable = false, updatable = true)
	private String title;
	
	@OneToOne(mappedBy = "jira")
	@JoinColumn(name = "statusId")
	private Status statusId;
	
	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project projectId;

	public int getJiraId() {
		return jiraId;
	}

	public void setJiraId(int jiraId) {
		this.jiraId = jiraId;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Status getStatusId() {
		return statusId;
	}

	public void setStatusId(Status statusId) {
		this.statusId = statusId;
	}

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}
	
	
}
	