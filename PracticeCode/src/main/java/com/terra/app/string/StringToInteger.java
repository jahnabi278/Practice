package com.terra.app.string;

public class StringToInteger {

	public static void main(String[] args) {
		String inputStr = "12345abc";
		System.out.println(returnTheIntegerString(inputStr));
	}

	private static int returnTheIntegerString(String inputStr) {
		inputStr = inputStr.trim();//to remove leading and tailing space 
		if(inputStr.length() == 0) {
			return 0;
		}
		

	}

}
