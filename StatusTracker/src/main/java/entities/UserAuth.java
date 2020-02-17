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
public class UserAuth {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  user_auth_id;
	
	private String token_id;
	
	private int user_id;
	
	private int group_id;
	
	private int status_id;
	
	private LocalDate session_expiry_date;
	
	public UserAuth() {
		// TODO Auto-generated constructor stub
	}

	public UserAuth(int user_auth_id, String token_id, int user_id, int group_id, int status_id,
			LocalDate session_expiry_date) {
		super();
		this.user_auth_id = user_auth_id;
		this.token_id = token_id;
		this.user_id = user_id;
		this.group_id = group_id;
		this.status_id = status_id;
		this.session_expiry_date = session_expiry_date;
	}

	public int getUser_auth_id() {
		return user_auth_id;
	}

	public void setUser_auth_id(int user_auth_id) {
		this.user_auth_id = user_auth_id;
	}

	public String getToken_id() {
		return token_id;
	}

	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public LocalDate getSession_expiry_date() {
		return session_expiry_date;
	}

	public void setSession_expiry_date(LocalDate session_expiry_date) {
		this.session_expiry_date = session_expiry_date;
	}

	@Override
	public String toString() {
		return "UserAuth [user_auth_id=" + user_auth_id + ", token_id=" + token_id + ", user_id=" + user_id
				+ ", group_id=" + group_id + ", status_id=" + status_id + ", session_expiry_date=" + session_expiry_date
				+ "]";
	}
	
	
	
}
