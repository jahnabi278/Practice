package com.terra.app.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author JahnabiSharma
 *
 */
public final class ImmutableDepartment {

	/**
	 * 1. Make the class final so it can't be subclassed. 2. Make all fields private
	 * and final. 3. Don't provide setters. 4. Initialize all fields via
	 * constructor. 5. Return copies of mutable fields (if any) in getters.
	 */
	private final String name;
	private final String id;
	private final List<String> employee;

	public ImmutableDepartment(String name, String id, List<String> employee) {
		super();
		this.name = name;
		this.id = id;
		this.employee = new ArrayList<>(employee);
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	/**
	 * Prevents modification of the original list through the returned reference.
	 * Ensures immutability when exposing internal collections from a class.
	 * 
	 * You can read elements using methods like get(), size(), etc. But you cannot
	 * add, remove, or modify elements. Throws UnsupportedOperationException: If you
	 * try to call methods like add(), remove(), or clear() on the returned list.
	 * Reflects changes in the original list:
	 * 
	 * If the original list is modified directly (not through the unmodifiable
	 * view), those changes will be visible in the unmodifiable list.
	 * 
	 */
	public List<String> getEmployee() {
		return Collections.unmodifiableList(employee);
	}

}
