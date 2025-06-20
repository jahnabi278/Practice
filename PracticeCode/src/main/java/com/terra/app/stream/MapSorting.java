package com.terra.app.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {
		 Map<String, Integer> studentDetails = new HashMap<>();
	        studentDetails.put("s1", 55);
	        studentDetails.put("s2", 45);
	        studentDetails.put("s3", 51);
	        studentDetails.put("s4", 46);
	        studentDetails.put("s5", 59);
	        studentDetails.put("s6", 40);

	        // Sort by value (marks) in ascending order
	        Map<String, Integer> sortedMap = studentDetails.entrySet()
	                .stream()
	                .sorted(Map.Entry.comparingByValue()) // ascending
	                .collect(Collectors.toMap(
	                        Map.Entry::getKey,
	                        Map.Entry::getValue,
	                        (e1, e2) -> e1, // merge function (not needed here)
	                        LinkedHashMap::new // maintain order
	                ));

	        // Print sorted map
	        sortedMap.forEach((key, value) -> 
	            System.out.println(key + " : " + value));

	}
}
