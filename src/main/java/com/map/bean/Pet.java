package com.map.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet_tbl")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	private String petName;
	private String petType;
	private int petAge;
	private String petWeight;
	private float petPrice;

	public Pet(int petId, String petName, String petType, int petAge, String petWeight, float petPrice) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petType = petType;
		this.petAge = petAge;
		this.petWeight = petWeight;
		this.petPrice = petPrice;
	}

	public Pet() {
		super();
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(String petWeight) {
		this.petWeight = petWeight;
	}

	public float getPetPrice() {
		return petPrice;
	}

	public void setPetPrice(float petPrice) {
		this.petPrice = petPrice;
	}

}
