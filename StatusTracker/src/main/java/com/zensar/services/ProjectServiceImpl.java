package com.zensar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.ProjectDao;
import com.zensar.entities.Project;

/**
 * @author Sushma Kumari
 * */
@Service
@Transactional
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

	@Override
	public Optional<Project> getByProjectId(Long projectId) {
		// TODO Auto-generated method stub
		return projectDao.findById(projectId);
	}

	@Override
	public List<Project> getAll() {
		// TODO Auto-generated method stub
		return projectDao.findAll();
	}
	
}
