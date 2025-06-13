package com.terra.app.str;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str = "      Hello this is TERRAPAY SOLUTION INDIA PRIVATE LIMITED !        ";
		String str1 = " is TERRAPAY SOLUTION "
				+ "        INDIA PRIVATE LIMITED !"
				+ "        ";

		System.out.println(str);
		System.out.println("Length :" + str.length());
		System.out.println("Character at 7 index :" + str.charAt(7));
		System.out.println("Character at 17 index :" + str.charAt(17));
		System.out.println("Unicode value at the index :" + str.codePointAt(0));
		System.out.println("case sensitive : " + "java".equals("Java"));
		System.out.println("case insensitive : " + "java".equalsIgnoreCase("JaVa"));
		// Lexicographic Comparison
		System.out.println("CompareTo : without difference " + "java".compareTo("java"));
		System.out.println("CompareTo : with difference " + "java".compareTo("jaba"));
		System.out.println("CompareTo : with difference " + str.compareTo(str1));

		System.out.println("Check if String contains sub string :" + str.contains(str1));
		System.out.println("Start with : case sensitive " + str.startsWith("hello"));
		System.out.println("Start with : case insensitive " + str.startsWith("Hello"));

		System.out.println("End with : case sensitive " + str.endsWith("d !"));
		System.out.println("End with : case insensitive " + str.endsWith("D !"));

		System.out.println("Check is empty :" + "".isEmpty());
		System.out.println("Check is empty : with white space " + "".isEmpty());

		// introduced in java 11+
		// System.out.println("Check isBlank : "+ str.isBlank());
		System.out.println("Index of : i " + str.indexOf("i"));
		System.out.println("Index of : I" + str.indexOf("I"));

		System.out.println("Last index of : I " + str.lastIndexOf("I"));
		System.out.println("SubString : " + str.substring(8));

		System.out.println("Substring from here to here : " + str.substring(8, 15));
		System.out.println("Upper case : " + str.toUpperCase());
		System.out.println("Lower case :" + str.toLowerCase());
		// removed white spaces
		System.out.println("Trim : " + "    Jah   nabi  ".trim());

		System.out.println("Replace : " + str.replace("INDIA", "Bharat"));
		System.out.println(
				"Replace all : " + "Hii India , namaste India , Sastriakal India ".replaceAll("India", "Bharat"));
		// java 11+
		System.out.println("Repeats : " + "ha".repeat(5));

		System.out.println("Split : ");
		Arrays.asList(str.split(" ")).forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println("Join : " + str.join("-", "a", "b", "c"));
		System.out.println("Strip Leading : trim whitespace from beginning  " + str.stripLeading());
		System.out.println("Strip Trailing : trim whitespace from end " + str.stripTrailing());
		System.out.println("Strip Indent : " + str1.stripIndent());

	}

}
