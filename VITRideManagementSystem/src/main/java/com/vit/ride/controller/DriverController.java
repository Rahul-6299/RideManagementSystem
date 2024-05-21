package com.vit.ride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vit.ride.model.Driver;
import com.vit.ride.service.DriverService;

@Controller
@RestController
@RequestMapping("/drivers")

public class DriverController {
	@Autowired
    private DriverService driverService;

    @PostMapping("/register")
    public Driver registerDriver(@RequestBody Driver driver) {
        return driverService.registerDriver(driver);
    }

    @DeleteMapping("/remove/{driverId}")
    public void removeDriver(@PathVariable String driverId) {
        driverService.removeDriver(driverId);
    }

    @GetMapping("/all")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

}
