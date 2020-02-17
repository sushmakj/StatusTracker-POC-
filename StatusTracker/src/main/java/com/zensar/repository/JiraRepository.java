package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;
import entities.Jira;

/*@author Akansha Shah
@Creation_date 12/02/2020 12:30PM
@Modification_date 12/02/2020 12:30PM
@copyright Zensar technologies. All rights reserved.
@version 2.0
*/

public interface JiraRepository extends CrudRepository<Jira, Integer> {

	Jira findByEntry_id(int entry_id);
	Jira findByTitle(String title);
}
