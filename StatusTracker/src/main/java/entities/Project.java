package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Sushma Kumari
 * @creation_date 11th Feb 2020 11:30
 * */

@Component
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int project_id;
	
	private String project_name;
	
	private int status_id;
	
	private int group_id;
	
	private LocalDate creation_date;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}



	public Project(int project_id, String project_name, int status_id, int group_id, LocalDate creation_date) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.status_id = status_id;
		this.group_id = group_id;
		this.creation_date = creation_date;
	}



	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public LocalDate getCreation_date() {
		return creation_date;
	}

	public int getProject_id() {
		return project_id;
	}



	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}



	public String getProject_name() {
		return project_name;
	}



	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}



	public void setCreation_date(LocalDate creation_date) {
		this.creation_date = creation_date;
	}



	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", status_id=" + status_id
				+ ", group_id=" + group_id + ", creation_date=" + creation_date + "]";
	}

	
	
	
}
