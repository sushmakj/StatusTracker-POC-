package com.zensar.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Sushma Kumari
 * @creation_date 11th Feb 2020 11:30
 */

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(nullable = false, updatable = true)
	private String userName;

	@Column(nullable = false, updatable = true, unique = true)
	private String password;
		
	@OneToOne(mappedBy = "user")
	@JoinColumn(name = "statusId")
	private Status statusId;

	@OneToOne(mappedBy = "user")
	@JoinColumn(name = "groupId")
	private List<UserGroup> groupId;

	@Column(nullable = false, updatable = true)
	private LocalDate creationDate;

	@OneToOne(mappedBy = "user")
	@JoinColumn(name = "projectId")
	private Project projectId;

	@OneToOne
	private UserAuth userAuth;

	public User(Long userId, String userName, String password, Status statusId, List<UserGroup> groupId,
			LocalDate creationDate, Project projectId, UserAuth userAuth) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.statusId = statusId;
		this.groupId = groupId;
		this.creationDate = creationDate;
		this.projectId = projectId;
		this.userAuth = userAuth;
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

	public Status getStatusId() {
		return statusId;
	}

	public void setStatusId(Status statusId) {
		this.statusId = statusId;
	}

	public List<UserGroup> getGroupId() {
		return groupId;
	}

	public void setGroupId(List<UserGroup> groupId) {
		this.groupId = groupId;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	public UserAuth getUserAuth() {
		return userAuth;
	}

	public void setUserAuth(UserAuth userAuth) {
		this.userAuth = userAuth;
	}
	
}