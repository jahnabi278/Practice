package com.terra.app.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniquePhoneNoCountForPerson {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("john", "smith", "111"), new Person("john", "smith", "232"),
				new Person("bob", "marley", "111"), new Person("bob", "marley", "323"),
				new Person("bob", "marley", "222"));
		Map<String, Set<String>> resultantMap = new HashMap<>();
		for (Person person : personList) {
			String key = person.fname + " " + person.lName;
			resultantMap.computeIfAbsent(key, (k) -> new HashSet<>()).add(person.phoneNo);
		}
		System.out.println(resultantMap);
		resultantMap.forEach((k, v) -> System.out.println(k + " " + v.size()));
	}

}

class Person {
	public String fname;
	public String lName;
	public String phoneNo;

	public Person(String fname, String lName, String phoneNo) {
		super();
		this.fname = fname;
		this.lName = lName;
		this.phoneNo = phoneNo;
	}

}