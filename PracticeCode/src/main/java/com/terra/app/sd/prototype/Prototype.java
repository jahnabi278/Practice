package com.terra.app.sd.prototype;

/**
 * Create new objects by cloning existing ones.
 *
 */
public class Prototype implements Cloneable {

	private String data;

	public Prototype(String data) {
		this.data = data;
	}

	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}

	public void show() {
		System.out.println("Data : " + data);
	}
}
