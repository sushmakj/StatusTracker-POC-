package entities;

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
public class Jira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int card_id;
	
	private int entry_id;
	
	private int created_by;
	
	private int assigned_by;
	
	private String description;
	
	private String title;
	 
	private int status_id;
	
	private int project_id;
	
	public Jira() {
		// TODO Auto-generated constructor stub
	}

	public Jira(int card_id, int entry_id, int created_by, int assigned_by, String description, String title,
			int status_id, int project_id) {
		super();
		this.card_id = card_id;
		this.entry_id = entry_id;
		this.created_by = created_by;
		this.assigned_by = assigned_by;
		this.description = description;
		this.title = title;
		this.status_id = status_id;
		this.project_id = project_id;
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public int getEntry_id() {
		return entry_id;
	}

	public void setEntry_id(int entry_id) {
		this.entry_id = entry_id;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getAssigned_by() {
		return assigned_by;
	}

	public void setAssigned_by(int assigned_by) {
		this.assigned_by = assigned_by;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	@Override
	public String toString() {
		return "Jira [card_id=" + card_id + ", entry_id=" + entry_id + ", created_by=" + created_by + ", assigned_by="
				+ assigned_by + ", description=" + description + ", title=" + title + ", status_id=" + status_id
				+ ", project_id=" + project_id + "]";
	}
	
	

}
