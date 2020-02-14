package com.zensar.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Jira;

/**
 * @author Sushma Kumari
 * */

@Repository
public interface JiraDao extends JpaRepository<Jira, Long> {

}
