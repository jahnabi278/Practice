package com.terra.app.sd.adapter;

import java.util.ArrayList;
import java.util.List;

public class SpiceJetAdapter implements AirlineAPIAdapter {

	@Override
	public List<Flight> searchFlights(FlightSearchRequest request) {
		List<Flight> listOfFlight = new ArrayList<>();
		listOfFlight.add(new Flight(5000.0, "SpiceJet001", request.source, request.destination, request.flightDateTime,
				"SpiceJet"));
		return listOfFlight;
	}

	@Override
	public boolean isFlightBooked(String flightId) {
		System.out.println("SpiceJet flight is available , flightId :" + flightId);
		return true;
	}

}
