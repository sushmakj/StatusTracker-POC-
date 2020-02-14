package com.zensar.services;

import com.zensar.daos.ProjectDao;
import com.zensar.entities.Project;

public class ProjectServiceImpl implements ProjectService {
	
	private ProjectDao projectDao;

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		projectDao.save(project);
	}

	@Override
	public void updateStatus(Project project) {
		// TODO Auto-generated method stub
		projectDao.save(project);
	}

	@Override
	public void deleteStatus(Project project) {
		// TODO Auto-generated method stub
		projectDao.delete(project);
	}
	
}
