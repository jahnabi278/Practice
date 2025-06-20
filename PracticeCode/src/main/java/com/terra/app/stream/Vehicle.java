package com.terra.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicle {

	private String vName;
	private double vPrice; // Price in lakhs
	private int manufacturingYear;

	// Constructor
	public Vehicle(String vName, double vPrice, int manufacturingYear) {
		this.vName = vName;
		this.vPrice = vPrice;
		this.manufacturingYear = manufacturingYear;
	}

	public double getVPrice() {
		return vPrice;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	@Override
	public String toString() {
		return "Vehicle [vName=" + vName + ", vPrice=" + vPrice + ", manufacturingYear=" + manufacturingYear + "]";
	}

	public static void main(String[] args) {
		List<Vehicle> vehicles = Arrays.asList(new Vehicle("Toyota Fortuner", 45, 2020),
				new Vehicle("Honda City", 12, 2017), new Vehicle("Swift", 8, 2019),
				new Vehicle("MG Gloster", 40, 2021));

		// Filter vehicles manufactured after 2018 and price > 10 lakhs
		List<Vehicle> filteredVehicles = vehicles.stream()
				.filter(v -> v.getManufacturingYear() > 2018 && v.getVPrice() > 10).collect(Collectors.toList());

		// Print the filtered vehicles
		filteredVehicles.forEach(System.out::println);
	}
}
