package com.zensar.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Sushma Kumari
 * @creation_date 11th Feb 2020 11:30
 * */

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectId;
	
	@Column(nullable = false, updatable = true)
	private String Name;
	
	@OneToOne
	private User createdBy; //UserId
	
	@Column(nullable = false, updatable = true)
	private String Description;
	
	@Column(nullable = false, updatable = true)
	private String version;
	
	@OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
	private List<Jira> jira;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Jira> getJira() {
		return jira;
	}

	public void setJira(List<Jira> jira) {
		this.jira = jira;
	}

	
}