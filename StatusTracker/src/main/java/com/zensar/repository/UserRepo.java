package com.zensar.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import entities.User;

/*@author Akansha Shah
@Creation_date 12/02/2020 12:30PM
@Modification_date 12/02/2020 12:30PM
@copyright Zensar technologies. All rights reserved.
@version 2.0
*/

public interface UserRepo extends CrudRepository<User, Integer> {

	User findByUser_id(int user_id);
	List<User> findByUser_name(String user_name);
}
