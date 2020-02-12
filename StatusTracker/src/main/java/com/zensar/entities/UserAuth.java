package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Sushma Kumari
 * @creation_date 11th Feb 2020 11:30
 * */


@Entity
public class UserAuth {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userAuthId;
	
	@Column(nullable = false, updatable = true, unique = true)
	private String tokenId;
	
	@Column(nullable = false, updatable = true, unique = true)
	private Long userId;
	
	private Long groupId;
	
	private Long statusId;
	
	@Column(nullable = false, updatable = true)
	private LocalDate sessionExpiryDate;

	public Long getUserAuthId() {
		return userAuthId;
	}

	public void setUserAuthId(Long userAuthId) {
		this.userAuthId = userAuthId;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public LocalDate getSessionExpiryDate() {
		return sessionExpiryDate;
	}

	public void setSessionExpiryDate(LocalDate sessionExpiryDate) {
		this.sessionExpiryDate = sessionExpiryDate;
	}
	
	

	}
	