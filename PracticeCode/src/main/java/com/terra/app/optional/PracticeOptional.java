package com.terra.app.optional;

import java.util.Optional;

public class PracticeOptional {
	public static void main(String[] args) {

		// Creating optional

		Optional<String> name = Optional.of("Alice"); // Throws NPE if null
		Optional<String> maybeName = Optional.ofNullable(null); // Safe
		Optional<String> empty = Optional.empty(); // Explicitly empty
		System.out.println(name.get());
		System.out.println(maybeName);
		System.out.println(empty);

		// Checking and Getting Values

		if (name.isPresent()) {
			System.out.println(name.get()); // Avoid unless you're sure it's present
		}
		if (maybeName.isPresent()) {
			System.out.println("This was empty - Optional.empty " + maybeName); // Avoid unless you're sure it's present
		}
		// differently
		name.ifPresent(System.out::println); // Prints value if present

		// Providing default value
		String defaultName = name.orElse("Default Name");
		String defaultName1 = empty.orElseGet(() -> "Default Name");

		System.out.println(defaultName);
		System.out.println(defaultName1);

		// Throwing exception if empty
		String value = name.orElseThrow(() -> new RuntimeException("Value not found"));
		System.out.println(value);

		/*
		 * String value1 = empty.orElseThrow(() -> new
		 * RuntimeException("Value not found")); System.out.println(value1);
		 */

		// Transforming values
		Optional<String> name2 = Optional.of("Alice");

		Optional<Integer> nameLength = name2.map(String::length); // Optional<Integer>
		System.out.println(nameLength.get());

		// Chaining optional with flatmap
		Optional<String> username = Optional.of("john_doe");
		Optional<String> domain = username.flatMap(user -> getEmail(user).map(email -> email.split("@")[1]));
		System.out.println(domain.get());
		
		
		//Filtering values 

		name.filter(n -> n.startsWith("A")).ifPresent(System.out::println);

	}

	public static Optional<String> getEmail(String user) {
		return Optional.of(user + "@example.com");
	}
}
