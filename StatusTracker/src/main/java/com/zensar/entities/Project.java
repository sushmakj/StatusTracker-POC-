package com.zensar.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
//	@JsonIgnore
//	@OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<User> users = new ArrayList<User>();
	
	// TODO: Create @OneToOne with User, Ms. Genius.
	@OneToOne(mappedBy = "project")
	@JoinColumn(name = "createdBy")
	private User user;
	
	@Column(nullable = false, updatable = true)
	private String description;
	
	@Column(nullable = false, updatable = true)
	private String version;
	
	@JsonIgnore
	@OneToMany(mappedBy = "project",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Jira> jiras = new ArrayList<Jira>();

	
	
}