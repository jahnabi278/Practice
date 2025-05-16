package com.terra.app.leetcode;

public class RemoveDuplicateFromSortedArr {

	public static void main(String[] args) {
		int[] sortedArr = { 0, 0,1,1 ,1,2,2,3,3,3,3,3,4,5,5,5,6,6,7,7};
		int lengthOfArr = removeDuplicateAndReturnUniqueArr(sortedArr);
		System.out.println(lengthOfArr);
		for(int i =0;i<lengthOfArr;i++) {
			System.out.print(sortedArr[i]+",");
		}
	}
	//for sorted Array 
	private static int removeDuplicateAndReturnUniqueArr(int[] sortedArr) {
		if (sortedArr.length == 0) {
			return 0;
		}
		int uniqueCount = 1;
		for (int i = 1; i < sortedArr.length; i++) {
			if (sortedArr[i] != sortedArr[i - 1]) {
				sortedArr[uniqueCount++] = sortedArr[i];
			}
		}
		return uniqueCount;
	}
	
	//for unsorted Array

}
