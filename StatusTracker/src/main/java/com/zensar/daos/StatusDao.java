package com.zensar.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Status;

/**
 * @author Sushma Kumari
 * */

@Repository
public interface StatusDao extends JpaRepository<Status, Long>{
	
}
