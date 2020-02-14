package com.zensar.daos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	public Optional<User> findByProjectId(String projectId);	
}
