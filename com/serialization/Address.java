package com.serialization;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	int houseNumber;
	String streetName;
	String currentCity;

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int hourseNumber) {
		this.houseNumber = hourseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", currentCity=" + currentCity
				+ "]";
	}
	
}