package com.terra.app.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalaryOfEmployee {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("jahnabi", 30000));
		emp.add(new Employee("sahil", 50000));
		emp.add(new Employee("Mriga", 60000));

		System.out.println(
				emp.stream().map(Employee::getSalary)
				.distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst());
	}

	static class Employee {
		private String name;
		private int salary;

		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}

		public int getSalary() {
			return salary;
		}
	}
}