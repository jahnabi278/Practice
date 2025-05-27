package com.terra.app.sd.adapter;

import java.util.List;

public class TestAdapterFacadePattern {

	public static void main(String[] args) {

		FacadeTicketBookingPortal portal = new FacadeTicketBookingPortal();

		List<Flight> availableFlights = portal.searchFlight(new FlightSearchRequest("blr", "ghy", "Mon 26 may 11:39"));
		for (Flight flight : availableFlights) {
			System.out.println(flight);
		}

		if (!availableFlights.isEmpty()) {
			Flight flight1 = availableFlights.get(0);
			portal.isFlightBooked(flight1.airline, flight1.flightId);
		}

	}

}
