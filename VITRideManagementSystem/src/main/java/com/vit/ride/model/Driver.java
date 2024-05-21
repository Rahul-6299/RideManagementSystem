package com.vit.ride.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Driver {
	 @Id
	    private String driverId;
	    private String name;
	    private String licenseNo;
	    private String vehicleInfo;
	    private boolean availability;
		public Driver(String driverId, String name, String licenseNo, String vehicleInfo, boolean availability) {
			super();
			this.driverId = driverId;
			this.name = name;
			this.licenseNo = licenseNo;
			this.vehicleInfo = vehicleInfo;
			this.availability = availability;
		}
		public String getDriverId() {
			return driverId;
		}
		public void setDriverId(String driverId) {
			this.driverId = driverId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLicenseNo() {
			return licenseNo;
		}
		public void setLicenseNo(String licenseNo) {
			this.licenseNo = licenseNo;
		}
		public String getVehicleInfo() {
			return vehicleInfo;
		}
		public void setVehicleInfo(String vehicleInfo) {
			this.vehicleInfo = vehicleInfo;
		}
		public boolean isAvailability() {
			return availability;
		}
		public void setAvailability(boolean availability) {
			this.availability = availability;
		}
		@Override
		public String toString() {
			return "Driver [driverId=" + driverId + ", name=" + name + ", licenseNo=" + licenseNo + ", vehicleInfo="
					+ vehicleInfo + ", availability=" + availability + "]";
		}
	    

}
