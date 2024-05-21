package com.vit.ride.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vit.ride.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, String>{

	

	
}
