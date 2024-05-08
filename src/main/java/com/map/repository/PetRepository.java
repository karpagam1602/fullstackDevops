package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.map.bean.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>  {
	  List<Pet> findByPetName(String petName);
		
		@Query("select petId from Pet")
		public List<Integer> getAllPetId();
		

}
