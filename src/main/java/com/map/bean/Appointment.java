package com.map.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment_tbl")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appId;
	private String appDate;
	
	@ManyToOne(targetEntity =Pet.class, cascade=CascadeType.REFRESH)
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@ManyToOne(targetEntity =User.class, cascade=CascadeType.REFRESH)
	@JoinColumn(name = "user_id")
	private User user;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int appId, String appDate, Pet pet, User user) {
		super();
		this.appId = appId;
		this.appDate = appDate;
		this.pet = pet;
		this.user = user;
	}
	
	
	
	
	
	
	
	
	

	
}
