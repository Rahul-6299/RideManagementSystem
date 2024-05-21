package com.vit.ride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vit.ride.model.Driver;
import com.vit.ride.model.Ride;
import com.vit.ride.service.DriverService;
import com.vit.ride.service.RideService;

@Controller
@RestController
@RequestMapping("/rides")
public class RideController {
	 @Autowired
	    private RideService rideService;

	    @Autowired
	    private DriverService driverService;

	    @PostMapping("/request")
	    public Ride requestRide(@RequestBody Ride ride) {
	        return rideService.requestRide(ride);
	    }

	    @GetMapping("/ongoing")
	    public List<Ride> getOngoingRides() {
	        return rideService.getOngoingRides();
	    }

	    @GetMapping("/history")
	    public List<Ride> getRideHistory() {
	        return rideService.getRideHistory();
	    }

	    @PutMapping("/complete/{rideId}")
	    public void completeRide(@PathVariable String rideId) {
	        rideService.completeRide(rideId);
	    }

	    @PutMapping("/allocate/{rideId}")
	    public void allocateDriverToRide(@PathVariable String rideId) {
	        Ride ride = rideService.getRideById(rideId);
	        Driver availableDriver = driverService.getAvailableDriver();
	        if (availableDriver != null) {
	            rideService.allocateDriverToRide(rideId, availableDriver.getDriverId());
	            driverService.updateDriverAvailability(availableDriver.getDriverId(), false);
	        }
	    }

}
