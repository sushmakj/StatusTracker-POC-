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
public class UserGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_group_id;
	
	private String user_group_name;
	
	private int status_id;
	
	public UserGroup() {
		// TODO Auto-generated constructor stub
	}

	public UserGroup(int user_group_id, String user_group_name, int status_id) {
		super();
		this.user_group_id = user_group_id;
		this.user_group_name = user_group_name;
		this.status_id = status_id;
	}

	public int getUser_group_id() {
		return user_group_id;
	}

	public void setUser_group_id(int user_group_id) {
		this.user_group_id = user_group_id;
	}

	public String getUser_group_name() {
		return user_group_name;
	}

	public void setUser_group_name(String user_group_name) {
		this.user_group_name = user_group_name;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	@Override
	public String toString() {
		return "UserGroup [user_group_id=" + user_group_id + ", user_group_name=" + user_group_name + ", status_id="
				+ status_id + "]";
	}
	
	
	
}
