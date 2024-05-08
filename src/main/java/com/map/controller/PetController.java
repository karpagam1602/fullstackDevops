package com.map.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.map.bean.Pet;
import com.map.repository.PetRepository;


@RestController
@CrossOrigin("*")
public class PetController {
	
	@Autowired
	private PetRepository petrepo;

	// to insert the data
	@PostMapping("/doPetInsert")
	Pet newPet(@RequestBody Pet newPet) {
		return petrepo.saveAndFlush(newPet);

	}

	// to get all the data from the database
	@GetMapping("/getAllPetList")
	List<Pet> getAllPets() {
		return petrepo.findAll();
	}

	

	

	// get the data from name
	@GetMapping("/findByPetName/{petName}")
	List<Pet> getCourseByName(@PathVariable String petName) {
		return petrepo.findByPetName(petName);

	}

	// get by id
	@GetMapping("/GetPetId/{petId}")
	public Optional<Pet> doCourseFind(@PathVariable("petId") int petId) {
		return petrepo.findById(petId);
	}

	

	// to get all the Id
	@GetMapping("/getPetIdList")
	List<Integer> getPetbylist() {
		return petrepo.getAllPetId();
	}

	
	

	
}
