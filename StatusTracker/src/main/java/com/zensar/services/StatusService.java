package com.zensar.services;

import java.util.List;

import com.zensar.entities.Status;

public interface StatusService {
	
	public void addStatus(Status status);
	public void updateStatus(Status status);
	public void deleteStatus(Status status);
	public List<Status> getAllByStatus();

}
