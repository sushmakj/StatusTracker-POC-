package com.zensar.services;

import java.util.List;
import java.util.Optional;

import com.zensar.entities.Project;

/**
 * @author Sushma Kumari
 * */

public interface ProjectService {
	
	public void addProject(Project project);
	public void updateStatus(Project project);
	public void deleteStatus(Project project);
	public Optional<Project> getByProjectId(Long projectId);
	public List<Project> getAll();
	
}
