package com.zensar.services;

import com.zensar.entities.Project;

public interface ProjectService {
	
	public void addProject(Project project);
	public void updateStatus(Project project);
	public void deleteStatus(Project project);
	
}
