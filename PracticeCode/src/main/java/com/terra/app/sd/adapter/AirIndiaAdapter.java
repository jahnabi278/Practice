package com.terra.app.sd.adapter;

import java.util.ArrayList;
import java.util.List;

public class AirIndiaAdapter implements AirlineAPIAdapter {

	@Override
	public List<Flight> searchFlights(FlightSearchRequest request) {
		List<Flight> listOfFlight = new ArrayList<>();
		listOfFlight.add(new Flight(5000.0, "AirIndia01", request.source, request.destination, request.flightDateTime,
				"AirIndia"));
		return listOfFlight;
	}

	@Override
	public boolean isFlightBooked(String flightId) {
		System.out.println("Air India flight is available , flightId :" + flightId);
		return true;
	}

}
