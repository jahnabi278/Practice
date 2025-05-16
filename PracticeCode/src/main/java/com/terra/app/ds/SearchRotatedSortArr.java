package com.terra.app.ds;

public class SearchRotatedSortArr {
	
	public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Check which half is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1;  // Search in the right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;  // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Target found at index: " + search(nums, target)); // Output: 4
    }

}
