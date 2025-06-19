package com.terra.app.reflection;

public class BaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseException(Exception e) {
		super(e);
	}

	public BaseException(String message, Exception e) {
		super(message, e);
	}

}
