package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.daos.StatusDao;
import com.zensar.entities.Status;

public class StatusSeviceImpl implements StatusService {

	@Autowired
	private StatusDao statusDao;
	
	@Override
	public void addStatus(Status status) {
		// TODO Auto-generated method stub
		statusDao.save(status);
	}

	@Override
	public void updateStatus(Status status) {
		// TODO Auto-generated method stub
		statusDao.save(status);
	}

	@Override
	public void deleteStatus(Status status) {
		// TODO Auto-generated method stub
		statusDao.delete(status);
	}

	@Override
	public List<Status> getAllByStatus() {
		// TODO Auto-generated method stub
		return statusDao.findAll();
	}

}
