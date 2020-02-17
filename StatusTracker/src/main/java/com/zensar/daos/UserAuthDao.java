package com.zensar.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entities.UserAuth;

/**
 * @author Sushma Kumari
 * */

public interface UserAuthDao extends JpaRepository<UserAuth, Long> {

}
