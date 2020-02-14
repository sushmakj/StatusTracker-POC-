package com.zensar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.UserDao;
import com.zensar.entities.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

	@Override
	public User getByprojectId(String projectId) {
		
		Optional<User> matchedProjectId= userDao.findByProjectId(projectId);
		
		if (matchedProjectId.isPresent())
			return matchedProjectId.get();
		
		return null;
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	
}
