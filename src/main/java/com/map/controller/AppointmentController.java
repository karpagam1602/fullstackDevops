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

import com.map.bean.Appointment;
import com.map.repository.AppointmentRepository;

@RestController
@CrossOrigin("*")
public class AppointmentController {
	
	@Autowired
	private AppointmentRepository apprepo;

	// to insert the data
	@PostMapping("/doAppInsert")
	Appointment newApp(@RequestBody Appointment newApp) {
		return apprepo.save(newApp);

	}

	// to get all the data from the database
	@GetMapping("/getAllAppList")
	List<Appointment> getAllApps() {
		return apprepo.findAll();
	}

	// get by id
		@GetMapping("/GetAppId/{appId}")
		public Optional<Appointment> doCourseFind(@PathVariable("appId") int appId) {
			return apprepo.findById(appId);
		}


	// to get all the Id
	@GetMapping("/getAppIdList")
	List<Integer> getAppbylist() {
		return apprepo.getAllAppointmentId();
	}


	

}
