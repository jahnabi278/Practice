package com.terra.app.sd.adapter;

public class FlightSearchRequest {
	String source;
	String destination;
	String flightDateTime;

	public FlightSearchRequest(String source, String destination, String flightDateTime) {
		super();
		this.source = source;
		this.destination = destination;
		this.flightDateTime = flightDateTime;
	}

}
