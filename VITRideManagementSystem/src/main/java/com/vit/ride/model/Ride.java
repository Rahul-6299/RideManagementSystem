package com.vit.ride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Ride {
	@Id
    private String rideId;
    private String userId;
    private String driverId;
    private String pickupLocation;
    private String destination;
    private String status;
	public Ride(String rideId, String userId, String driverId, String pickupLocation, String destination,
			String status) {
		super();
		this.rideId = rideId;
		this.userId = userId;
		this.driverId = driverId;
		this.pickupLocation = pickupLocation;
		this.destination = destination;
		this.status = status;
	}
	public String getRideId() {
		return rideId;
	}
	public void setRideId(String rideId) {
		this.rideId = rideId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = "requested";
	}
	@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", userId=" + userId + ", driverId=" + driverId + ", pickupLocation="
				+ pickupLocation + ", destination=" + destination + ", status=" + status + "]";
	}
    

}
