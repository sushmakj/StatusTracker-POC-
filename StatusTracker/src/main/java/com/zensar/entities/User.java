/**
 * @author Sushma Kumari
 * @creation_date 11th Feb 2020 11:30
 */

package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(nullable = false, updatable = true, unique = true)
	private String userName;

	@Column(nullable = false, updatable = true)
	private String password;
		
	@OneToOne(mappedBy = "user")
	@JoinColumn(name = "statusId")
	private Status status;

	@OneToOne(mappedBy = "user")
	@JoinColumn(name = "groupId")
	private UserGroup userGroup;

	@Column(nullable = false, updatable = true)
	private LocalDate creationDate;

//	@ManyToOne
//	@JoinColumn(name = "projectId")				// order MySQL to add a FK for ProjectID
	private String projectId;					// order Spring Boot to send a Project object inside User object
	
	private Project project;
	
	public User() {
		// keep this blank for Spring Security
	}

	public User(Long userId, String userName, String password, Status status, UserGroup userGroup,
			LocalDate creationDate, String projectId, Project project) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.userGroup = userGroup;
		this.creationDate = creationDate;
		this.projectId = projectId;
		this.project = project;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public UserGroup getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getProjectId() {
		return projectId;
	}
 
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}