package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.map.bean.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
		
		@Query("select userId from User")
		public List<Integer> getAllUserId();

}
