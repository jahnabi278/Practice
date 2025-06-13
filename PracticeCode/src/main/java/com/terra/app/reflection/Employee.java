package com.terra.app.reflection;

public class Employee {
	private String eid;
	private double eSalary;
	private String eName;
	private String eAddress;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public Employee(String eid, double eSalary, String eName, String eAddress) {
		super();
		this.eid = eid;
		this.eSalary = eSalary;
		this.eName = eName;
		this.eAddress = eAddress;
	}

	public Employee() {
	}

}
