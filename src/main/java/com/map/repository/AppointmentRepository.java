package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.map.bean.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	
	
	@Query("select appId from Appointment")
	public List<Integer> getAllAppointmentId();
	

}
