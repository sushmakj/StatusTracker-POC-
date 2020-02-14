package com.zensar.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entities.UserGroup;

@Repository
public interface UserGroupDao extends JpaRepository<UserGroup, Long> {
	public Optional<UserGroup> findByStatusId(Long statusId);	
	public List<UserGroup> findByAccessControl(String accessControl);	
}

