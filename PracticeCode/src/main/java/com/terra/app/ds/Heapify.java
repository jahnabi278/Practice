package com.terra.app.ds;

import java.util.Arrays;

public class Heapify {

	 // Min-Heapify function
    public static void minHeapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(arr, i, smallest);
            minHeapify(arr, n, smallest);
        }
    }

    // Max-Heapify function
    public static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, n, largest);
        }
    }

    // Utility function to build a Min-Heap
    public static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(arr, n, i);
        }
    }

    // Utility function to build a Max-Heap
    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    // Swap function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
		int[] arr = {4, 10, 3, 5, 1};
        int n = arr.length;

        
        Heapify heapify = new Heapify();
        // Build Min Heap
        heapify.buildMinHeap(arr, n);
        System.out.println("Min Heap: " + Arrays.toString(arr));

        // Build Max Heap
        //int[] arr2 = {4, 10, 3, 5, 1}; // Reset array
        //buildMaxHeap(arr2, n);
        //System.out.println("Max Heap: " + Arrays.toString(arr2));

	}

}
