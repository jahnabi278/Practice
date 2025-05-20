package com.terra.app.logical;

import java.util.HashMap;
import java.util.Map;

public class MostFrequestCharacter {
	public static void main(String[] args) {
        String input = "hava";
        char mostFrequent = getMostFrequentChar(input);
        System.out.println("Most frequent character: " + mostFrequent);
    }

    public static char getMostFrequentChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }

}
