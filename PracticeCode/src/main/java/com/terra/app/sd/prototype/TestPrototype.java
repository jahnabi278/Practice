package com.terra.app.sd.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype prototype = new Prototype("Original");
		Prototype proto = prototype.clone();
		proto.show();
	}

}
