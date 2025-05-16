package com.terra.app.logical;

import java.util.Optional;

public class OptionalExampke {
	public static void main(String[] args) {
		// Create an Optional with a value
		Optional<String> optionalValue = Optional.of("Hello");

		// Create an empty Optional
		Optional<String> emptyOptional = Optional.empty();

		// Create an Optional that might be null
		Optional<String> nullableOptional = Optional.ofNullable(null);

		// Check if a value is present
		if (optionalValue.isPresent()) {
			System.out.println("Value: " + optionalValue.get());
		}

		// Provide a default value if no value is present
		String result = emptyOptional.orElse("Default Value");
		System.out.println("Result: " + result);

		// Apply a function if a value is present
		optionalValue.ifPresent(value -> System.out.println("Value length: " + value.length()));

		// Use map to transform the value
		Optional<Integer> length = optionalValue.map(String::length);
		length.ifPresent(len -> System.out.println("Value length: " + len));

		// Use flatMap for nested Optionals
		Optional<String> upperCase = optionalValue.flatMap(val -> Optional.of(val.toUpperCase()));
		upperCase.ifPresent(System.out::println);
	}
}
