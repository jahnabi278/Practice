package com.terra.app.sd.adapter;

public class Flight {
	private double price;
	String flightId;
	private String source;
	private String destination;
	private String flightDateTime;
	String airline;

	public Flight(double price, String flightId, String source, String destination, String flightDateTime,
			String airline) {
		super();
		this.price = price;
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.flightDateTime = flightDateTime;
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [price=" + price + ", flightId=" + flightId + ", source=" + source + ", destination="
				+ destination + ", time=" + flightDateTime + ", airline=" + airline + "]";
	}

}
