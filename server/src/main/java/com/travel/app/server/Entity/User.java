package com.travel.app.server.Entity;


import java.sql.Timestamp;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

	@Id
	private UUID userID;
	
	private String userName;
	private String userImage;
	private boolean active;
	private Timestamp joiningDate;
	
	public User() {
		super();		
	}

	public User(UUID userID, String userName, String userImage, boolean active, Timestamp joiningDate) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userImage = userImage;
		this.active = active;
		this.joiningDate = joiningDate;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Timestamp getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Timestamp joiningDate) {
		this.joiningDate = joiningDate;
	}

}
