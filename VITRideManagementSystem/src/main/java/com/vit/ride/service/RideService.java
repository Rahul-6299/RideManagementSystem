package com.vit.ride.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.ride.model.Ride;
import com.vit.ride.repository.RideRepository;

@Service

public class RideService {
	 @Autowired
	    private RideRepository rideRepository;

	    public Ride requestRide(Ride ride) {
	        return rideRepository.save(ride);
	    }

	    public List<Ride> getOngoingRides() {
	        return rideRepository.findAll().stream()
	                .filter(ride -> !ride.getStatus().equals("Completed"))
	                .toList();
	    }

	    public List<Ride> getRideHistory() {
	        return rideRepository.findAll().stream()
	                .filter(ride -> ride.getStatus().equals("Completed"))
	                .toList();
	    }

	    public void completeRide(String rideId) {
	        Ride ride = rideRepository.findById(rideId).orElse(null);
	        if (ride != null) {
	            ride.setStatus("Completed");
	            rideRepository.save(ride);
	        }
	    }

	    public void allocateDriverToRide(String rideId, String driverId) {
	        Ride ride = rideRepository.findById(rideId).orElse(null);
	        if (ride != null) {
	            ride.setDriverId(driverId);
	            ride.setStatus("Allocated");
	            rideRepository.save(ride);
	        }
	    }
   
}
