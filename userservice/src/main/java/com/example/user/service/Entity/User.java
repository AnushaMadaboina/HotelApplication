package com.example.user.service.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="user-service")
public class User {
	
	@Id
	private String id;
	private String uname;
	private String email;
	private String about;
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", email=" + email + ", about=" + about + ", ratings=" + ratings
				+ "]";
	}
	@Transient
	private List<Rating> ratings;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public User(String id, String uname, String email, String about, List<Rating> ratings) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.about = about;
		this.ratings = ratings;
	}
	public User() {
		super();
	}
	
}