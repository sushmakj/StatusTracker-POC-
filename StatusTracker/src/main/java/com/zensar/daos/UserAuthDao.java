package com.zensar.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entities.UserAuth;

public interface UserAuthDao extends JpaRepository<UserAuth, Long> {

}
