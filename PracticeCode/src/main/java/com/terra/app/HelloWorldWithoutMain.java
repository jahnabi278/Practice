package com.terra.app;

public class HelloWorldWithoutMain {
	/**
	 * Using a Dummy main method with a Static Block (Java 7+): From Java 7 onwards,
	 * the JVM explicitly requires a main method for program execution. However, you
	 * can still leverage static blocks by having a main method that does nothing,
	 * allowing the static block to perform the desired action.
	 * 
	 * Using a Static Block (Pre-Java 7): In Java versions prior to Java 7, a static
	 * block within a class would execute when the class was loaded into memory.
	 * This behavior allowed for code execution without a main method.
	 */

	static {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {

	}

}
