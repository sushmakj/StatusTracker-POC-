package com.zensar.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.daos.UserGroupDao;
import com.zensar.entities.UserGroup;

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

}
