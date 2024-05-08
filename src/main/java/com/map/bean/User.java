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
@Table(name = "user_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userCity;
	private String userAge;

	@ManyToOne(targetEntity = Pet.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "pet_id")
	private Pet pet;

	public User() {
		super();
	}

	public User(int userId, String userName, String userCity, String userAge, Pet pet) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCity = userCity;
		this.userAge = userAge;
		this.pet = pet;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity + ", userAge=" + userAge
				+ ", pet=" + pet + "]";
	}

}
