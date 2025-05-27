package com.terra.app.sd.adapter;

import java.util.ArrayList;
import java.util.List;

public class FacadeTicketBookingPortal {

	private List<AirlineAPIAdapter> listOfAirlineAPIAdapter;

	public FacadeTicketBookingPortal() {
		listOfAirlineAPIAdapter = new ArrayList<>();
		listOfAirlineAPIAdapter.add(new AirIndiaAdapter());
		listOfAirlineAPIAdapter.add(new SpiceJetAdapter());
	}

	public List<Flight> searchFlight(FlightSearchRequest request) {
		List<Flight> listOfFlights = new ArrayList<>();
		for (AirlineAPIAdapter adapter : listOfAirlineAPIAdapter) {
			listOfFlights.addAll(adapter.searchFlights(request));
		}
		return listOfFlights;

	}

	public boolean isFlightBooked(String airline, String flightId) {
		for (AirlineAPIAdapter adapter : listOfAirlineAPIAdapter) {
			if (adapter.searchFlights(new FlightSearchRequest("blr", "ghy", "Mon 26 may 11:39")).stream()
					.anyMatch(f -> f.flightId.equals(flightId) && f.airline.equals(airline))) {
				return adapter.isFlightBooked(flightId);

			}
		}
		System.out.println("Flight is not avaiable in the system ");
		return false;

	}

}
