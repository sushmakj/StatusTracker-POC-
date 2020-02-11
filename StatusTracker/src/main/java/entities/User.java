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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	
	private String user_name;
	
	private int status_id;
	 
	private int group_id;
	
	private LocalDate creation_date;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String user_name, int status_id, int group_id, LocalDate creation_date) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.status_id = status_id;
		this.group_id = group_id;
		this.creation_date = creation_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getStatus_id() {
		return status_id;
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

	public void setCreation_date(LocalDate creation_date) {
		this.creation_date = creation_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", status_id=" + status_id + ", group_id="
				+ group_id + ", creation_date=" + creation_date + "]";
	}
	
	
}
