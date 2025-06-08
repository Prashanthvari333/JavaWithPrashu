package com.prashu.basics;

public class ConditionalStatements {
	
	public static void main() {
		
		 int num = 20;

	     // Simple if
	     if (num > 0) {
	         System.out.println("Number is positive");
	     }

	     // if-else
	     if (num % 2 == 0) {
	         System.out.println("Even number");
	     } else {
	         System.out.println("Odd number");
	     }

	     // if-else-if ladder
	     if (num < 0) {
	         System.out.println("Negative number");
	     } else if (num == 0) {
	         System.out.println("Zero");
	     } else {
	         System.out.println("Positive number");
	     }

	     // Nested if
	     int age = 22;
	     String gender = "Male";
	     if (age > 18) {
	         if (gender.equals("Male")) {
	             System.out.println("Eligible for army service");
	         }
	     }
		
	}

}
