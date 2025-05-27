package com.terra.app.sd.adapter;

import java.util.List;

public interface AirlineAPIAdapter {

	public List<Flight> searchFlights(FlightSearchRequest request);

	public boolean isFlightBooked(String flightId);
}
