package com.zensar.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Status;

@Repository
public interface StatusDao extends JpaRepository<Status, Long>{
	public List<Status> findByStatusId(String statusId);	

}
