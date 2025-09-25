package com.terra.app.sd.builder;

public class Computer {

	private String CPU;
	private String RAM;
	private String storage;

	public Computer(String CPU, String RAM, String storage) {
		this.CPU = CPU;
		this.RAM = RAM;
		this.storage = storage;
	}

	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + "]";
	}

}
