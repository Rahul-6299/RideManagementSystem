package com.vit.ride.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vit.ride.model.Driver;

@Repository

public interface DriverRepository extends JpaRepository<Driver, String>{

}
