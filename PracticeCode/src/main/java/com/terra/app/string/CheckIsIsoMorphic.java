package com.terra.app.string;

import java.util.*;

public class CheckIsIsoMorphic {

	public static void main(String[] args) {
		String str1 = "add";
		String str2 = "ggg";
		System.out.println(isIsoMorphicStr(str1, str2));
	}

	private static boolean isIsoMorphicStr(String str1, String str2) {
		if ((str1 == null || str1.isEmpty()) && (str2 == null || str2.isEmpty())) {
			return false;
		} else if (str1.length() != str2.length()) {
			return false;
		} else {
			Map<Character, Character> hm = new HashMap<>();
			Set<Character> mappedTargetSet = new HashSet<>();
			for (int i = 0; i < str1.length(); i++) {
				if (hm.containsKey(str1.charAt(i))) {
					if (hm.get(str1.charAt(i)).equals(str2.charAt(i))) {
						return true;
					} else {
						return false;
					}
				} else {
					if (mappedTargetSet.contains(str2.charAt(i))) {
						return false;
					}
					hm.put(str1.charAt(i), str2.charAt(i));
					mappedTargetSet.add(str2.charAt(i));
				}
			}
		}
		return false;

	}

}
