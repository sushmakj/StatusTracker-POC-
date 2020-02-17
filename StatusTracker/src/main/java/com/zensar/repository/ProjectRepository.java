package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;
import entities.Project;

/*@author Akansha Shah
@Creation_date 12/02/2020 12:30PM
@Modification_date 12/02/2020 12:30PM
@copyright Zensar technologies. All rights reserved.
@version 2.0
*/

public interface ProjectRepository extends CrudRepository<Project, Integer> {
  
	Project findByProject_name(String project_name);
}
