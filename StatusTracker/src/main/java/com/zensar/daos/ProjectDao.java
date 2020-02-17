package com.zensar.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Project;

/**
 * @author Sushma Kumari
 * */

@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {
	
}
