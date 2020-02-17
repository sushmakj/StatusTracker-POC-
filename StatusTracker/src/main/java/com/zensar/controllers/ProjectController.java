package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import entities.Project;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@GetMapping("/projects")
	public List<Project> getAllProjects() {
		return projectService.findAllProjects();
	}

	@GetMapping("/project/{id}")
	public User getProject(@PathVariable("id") int projectId) {
		return projectService.findProjectById(projectId);
	}

	@PostMapping("/project/add")
	public String add(@RequestBody Project project) {
		projectService.addProject(project);
		return "new Project" + project.getProject_id() + "is added succesfully";
	}

	@PutMapping("/user/update")
	public String update(@RequestBody Project project) {
		projectService.updateProject(project);
		return "new Project" + project.getProject_id() + "is updated succesfully";
	}

	@DeleteMapping("/user/delete")
	public String delete(@RequestBody Project project) {
		projectService.deleteProject(project);
		return "new Project" + project.getProject_id() + "is deleted succesfully";
	}
}
