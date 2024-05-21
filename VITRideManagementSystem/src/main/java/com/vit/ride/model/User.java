package com.vit.ride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
	@Id
    private String userId;
    private String name;
    private String contactInfo;
	public User(String userId, String name, String contactInfo) {
		super();
		this.userId = userId;
		this.name = name;
		this.contactInfo = contactInfo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", contactInfo=" + contactInfo + "]";
	}
    

}
