package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import entities.UserGroup;

@RestController
public class UserGroupController {
	@Autowired
	private UserGroupService userGroupService;

	@GetMapping("/usergroups")
	public List<UserGroup> getAllGroups() {
		return userGroupService.findAllGroups();
	}

	@GetMapping("/usergroup/{id}")
	public User getGroup(@PathVariable("id") int groupId) {
		return userGroupService.findGroupById(groupId);
	}

	@PostMapping("/usergroup/add")
	public String add(@RequestBody UserGroup usergroup) {
		userGroupService.addProject(usergroup);
		return "new Group" + usergroup.getUser_group_id() + "is added succesfully";
	}

	@PutMapping("/usergroup/update")
	public String update(@RequestBody UserGroup usergroup) {
		userGroupService.updateGroup(usergroup);
		return "Groject" + usergroup.getUser_group_id() + "is updated succesfully";
	}

	@DeleteMapping("/usergroup/delete")
	public String delete(@RequestBody UserGroup usergroup) {
		userGroupService.deleteGroup(usergroup);
		return "Group" + usergroup.getUser_group_id() + "is deleted succesfully";
	}
}
