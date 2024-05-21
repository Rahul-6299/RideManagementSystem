package com.vit.ride.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.ride.model.Driver;
import com.vit.ride.repository.DriverRepository;

@Service

public class DriverService {
	 @Autowired
	    private DriverRepository driverRepository;

	    public Driver registerDriver(Driver driver) {
	        return driverRepository.save(driver);
	    }

	    public void removeDriver(String driverId) {
	        driverRepository.deleteById(driverId);
	    }

	    public List<Driver> getAllDrivers() {
	        return driverRepository.findAll();
	    }

	    public Driver getAvailableDriver() {
	        return driverRepository.findAll().stream()
	                .filter(Driver::isAvailability)
	                .findFirst()
	                .orElse(null);
	    }

	    public void updateDriverAvailability(String driverId, boolean availability) {
	        Driver driver = driverRepository.findById(driverId).orElse(null);
	        if (driver != null) {
	            driver.setAvailability(availability);
	            driverRepository.save(driver);
	        }
	    }
   
}
