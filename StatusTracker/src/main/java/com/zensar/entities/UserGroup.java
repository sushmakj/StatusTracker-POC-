package com.zensar.entities;

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
 * */

@Entity
public class UserGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userGroupId;
	
	@Column(nullable = false, updatable = true, unique = true)
	private String name;
	
	@Column(nullable = false, updatable = true)
	private String accessControl;
	
	@OneToOne
	private User user;
	
	@OneToOne(mappedBy = "UserGroup")
	@JoinColumn(name = "statusId")
	private Status statusId;
		
	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Status getStatusId() {
		return statusId;
	}

	public void setStatusId(Status statusId) {
		this.statusId = statusId;
	}

	public String getAccessControl() {
		return accessControl;
	}

	public void setAccessControl(String accessControl) {
		this.accessControl = accessControl;
	}

}
	