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
import entities.Status;

@RestController
public class StatusContoller {
	@Autowired
	private StatusService projectService;

	@GetMapping("/status")
	public List<Status> getAllStatus() {
		return statusService.findAllStatus();
	}

	@GetMapping("/status/{id}")
	public Status getStatus(@PathVariable("id") int statusId) {
		return statusService.findStatusById(statusId);
	}

	@PostMapping("/status/add")
	public String add(@RequestBody Status status) {
		statusService.addStatus(status);
		return "new status" + status.getStatus_id() + "is added succesfully";
	}

	@PutMapping("/status/update")
	public String update(@RequestBody Status status) {
		statusService.updateStatus(status);
		return "Status" + status.getStatus_id() + "is updated succesfully";
	}

	@DeleteMapping("/status/delete")
	public String delete(@RequestBody Status status) {
		statusService.deleteProject(status);
		return "Status" + status.getStatus_id() + "is deleted succesfully";
	}
}
