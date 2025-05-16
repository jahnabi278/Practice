package com.terra.app.ds;

public class Singleton {
	private static Singleton singletonInstance = null;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (null == singletonInstance) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

}
