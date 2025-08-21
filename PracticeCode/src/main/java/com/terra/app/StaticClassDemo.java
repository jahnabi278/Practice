package com.terra.app;

public class StaticClassDemo {
	private String instanceVariable = "27th AUG";

	public static void main(String[] args) {
		System.out.println("Hello World");
		TestStatic.display();
		TestStatic.main(null);
	}

	static class TestStatic {
		static void display() {
			StaticClassDemo dm = new StaticClassDemo();
			System.out.println("I am from static class" + dm.instanceVariable);
		}

		public static void main(String[] args) {
			System.out.println("Static class");
			display();
		}
	}
}
