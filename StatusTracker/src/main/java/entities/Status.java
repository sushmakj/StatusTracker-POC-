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
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int status_id;
	
	private String status_name;
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(int status_id, String status_name) {
		super();
		this.status_id = status_id;
		this.status_name = status_name;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}

	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", status_name=" + status_name + "]";
	}
	
	
}
