package com.prashu.basics;

//Topic: Type Casting in Java

/*
 * Type casting in Java is the process of converting one data type into another. There are two types:

	Widening Casting (Implicit) – smaller to larger type

	Narrowing Casting (Explicit) – larger to smaller type (requires manual conversion)
*/
public class TypeCasting {
	

	
	public static void main(String[] args) {
		/*
		 * 1. Widening Casting (Automatic) When? From smaller → larger type (e.g., int →long)
		 * Why? No risk of data loss
		 */
		int i = 10;
		long l = i; // Implicit casting
		double d = l;
		
//		 2. Narrowing Casting (Manual)
//		 When? From larger → smaller type (e.g., double → int)
//
//		 Why? May lose data, so needs explicit cast
		
		 double dd = 9.78;
		 int id = (int) dd; // Explicit casting, i becomes 9
	}

}
