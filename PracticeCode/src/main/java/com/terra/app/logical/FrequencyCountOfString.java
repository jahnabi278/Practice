package com.terra.app.logical;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountOfString {

	public static void main(String[] args) {
		String[] strArray = { "apple", "banana", "apple", "orange", "banana", "apple" };
		Map<String, Integer> frequencyMap = countStringFrequency(strArray);
		System.out.println(frequencyMap);

		for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("String: " + entry.getKey() + ", Frequency: " + entry.getValue());
		}

		// using map.compute
		Map<String, Integer> fmap = new HashMap<>();
		for (String str : strArray) {
			fmap.compute(str, (k, v) -> (v == null) ? 1 : v + 1);
		}
		System.out.println("Computed map :" + fmap);

		// using map.merge
		Map<String, Integer> fmap2 = new HashMap<>();
		for (String str : strArray) {
			fmap2.merge(str, 1, Integer::sum);
		}
		System.out.println("Merge map :" + fmap2);
	}

	public static Map<String, Integer> countStringFrequency(String[] strArray) {
		Map<String, Integer> freqMap = new HashMap<>();
		for (String str : strArray) {
			freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
		}
		return freqMap;
	}
}
