package com.zensar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.UserGroupDao;
import com.zensar.entities.UserGroup;

/**
 * @author Sushma Kumari
 * */
@Service
@Transactional
public class UserGroupServiceImpl implements UserGroupService {

	@Autowired
	public UserGroupDao userGroupDao;
	
	@Override
	public void addUserGroup(UserGroup userGroup) {
			userGroupDao.save(userGroup);
	}

	@Override
	public void updateUserGroup(UserGroup userGroup) {
		userGroupDao.save(userGroup);

	}

	@Override
	public void deleteUserGroup(UserGroup userGroup) {
		userGroupDao.delete(userGroup);

	}

	@Override
	public Optional<UserGroup> getByUserGroupId(Long userGroupId) {
		// TODO Auto-generated method stub
		return userGroupDao.findById(userGroupId);
	}

	@Override
	public List<UserGroup> getAllByUserGroup() {
		// TODO Auto-generated method stub
		return userGroupDao.findAll();
	}

}
