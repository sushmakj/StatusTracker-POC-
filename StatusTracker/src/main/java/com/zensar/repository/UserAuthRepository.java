package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;
import entities.UserAuth;

/*@author Akansha Shah
@Creation_date 12/02/2020 12:30PM
@Modification_date 12/02/2020 12:30PM
@copyright Zensar technologies. All rights reserved.
@version 2.0
*/

public interface UserAuthRepository extends CrudRepository<UserAuth, Integer> {
 
	UserAuth findByToken_id(String token_id);
}
