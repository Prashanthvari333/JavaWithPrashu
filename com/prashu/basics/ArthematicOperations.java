package com.prashu.basics;


// Topic: Arithmetic Operations in Java
public class ArthematicOperations {
	
	public static void main(String[] args) {
//		1. Basic Arithmetic Operators
		
//		2. Integer vs Floating-point Division
		int a = 5 / 2;       // result: 2
		double b = 5.0 / 2;  // result: 2.5
		
		
//		3. Type Promotion in Expressions
		int x = 5;
		double y = 2.0;
		double result1 = x + y; // x is promoted to double
		
//		4. Operator Precedence
//		Order: *, /, % → then +, -
		
		int result2 = 10 + 5 * 2; // 10 + (5*2) = 20
		
//		5. Using Parentheses
//		To control order of operations:
		
		int result3= (10 + 5) * 2; // 15 * 2 = 30
		
//		6. Unary Operators (Optional Advanced)
//		++, --, +, -

		int p = 5;
		System.out.println(++p); // 6
		System.out.println(p++); // 6, then a becomes 7
	}
	
}
