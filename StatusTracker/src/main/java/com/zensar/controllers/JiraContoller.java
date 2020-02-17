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

import entities.Jira;

@RestController
public class JiraContoller {
	@Autowired
	private JiraService jiraService;

	@GetMapping("/jira")
	public List<Jira> getAllJira() {
		return jiraService.findAllJira();
	}

	@GetMapping("/jira/{id}")
	public User getProject(@PathVariable("id") int projectId) {
		return jiraService.findProjectById(projectId);
	}

	@PostMapping("/jira/add")
	public String add(@RequestBody Jira jira) {
		jiraService.addProject(jira);
		return "new Project" + jira.getEntry_id()+ "is added succesfully";
	}

	@PutMapping("/jira/update")
	public String update(@RequestBody Project jira) {
		jiraService.updateProject(jira);
		return "new Project" + project.getProject_id() + "is updated succesfully";
	}

	@DeleteMapping("/jira/delete")
	public String delete(@RequestBody Project jira) {
		jiraService.deleteProject(jira);
		return "new Project" + project.getProject_id() + "is deleted succesfully";
	}
}
