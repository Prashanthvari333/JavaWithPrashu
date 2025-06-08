package com.prashu.basics;

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("Length of array: " + marks.length);
        System.out.println("First mark: " + marks[0]);

        // Using for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }

        
     // Declaration only
        int[] arr2;      // Recommended
        int arr[];      // Also valid

        // Declaration + Allocation
        arr2 = new int[5];    // default values: 0

        // Declaration + Initialization
        int[] nums = {10, 20, 30, 40};

        // Using enhanced for loop
        for (int mark : marks) {
            System.out.println("Mark: " + mark);
        }
        
        
        int[] arr3 = {3, 1, 4, 2};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        
//        Multidimensional Arrays
        int[] arr1 = {3, 1, 4, 2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        
//        Arrays with Other Data Types
        double[] prices = new double[3];
        String[] names = {"Ram", "Sita", "Lakshman"};
        boolean[] flags = new boolean[2]; // default: false

        
    }
    
	/*
	 * Reverse an array
	 * 
	 * Check if array is palindrome
	 * 
	 * Remove duplicates (later with collections)
	 * 
	 * Sort an array without using built-in method (logic building)
	 */
}

