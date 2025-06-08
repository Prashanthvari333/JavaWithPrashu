package com.prashu.basics;

public class MathLib {
	
	/*
	 * The Math class provides static methods for common math operations like:
	 * 
	 * Powers, square roots, trigonometry
	 * 
	 * Rounding, absolute value
	 * 
	 * Random number generation
	 */
	public static void main(String[] args) {
		
//		| Method           | Description                    | Example                  |
//		| ---------------- | ------------------------------ | ------------------------ |
//		| `Math.abs(x)`    | Absolute value                 | `Math.abs(-5)` → `5`     |
//		| `Math.max(x, y)` | Maximum of two numbers         | `Math.max(3, 7)` → `7`   |
//		| `Math.min(x, y)` | Minimum of two numbers         | `Math.min(3, 7)` → `3`   |
//		| `Math.sqrt(x)`   | Square root                    | `Math.sqrt(16)` → `4.0`  |
//		| `Math.pow(x, y)` | `x` raised to the power of `y` | `Math.pow(2, 3)` → `8.0` |
//		| `Math.cbrt(x)`   | Cube root                      | `Math.cbrt(27)` → `3.0`  |
		
		
		System.out.println("Abs: " + Math.abs(-10));
		System.out.println("Max: " + Math.max(20, 30));
		System.out.println("Min: " + Math.min(20, 30));
		System.out.println("Power: " + Math.pow(2, 3));
		System.out.println("Square Root: " + Math.sqrt(49));
		System.out.println("Cube Root: " + Math.cbrt(27));
		
		
//		| Method          | Description               | Example                   |
//		| --------------- | ------------------------- | ------------------------- |
//		| `Math.round(x)` | Rounds to nearest integer | `Math.round(2.6)` → `3`   |
//		| `Math.ceil(x)`  | Rounds up                 | `Math.ceil(2.3)` → `3.0`  |
//		| `Math.floor(x)` | Rounds down               | `Math.floor(2.9)` → `2.0` |
		
        System.out.println("Ceil: " + Math.ceil(5.2));
        System.out.println("Floor: " + Math.floor(5.8));
        System.out.println("Round: " + Math.round(5.5));
        
//		Random Number Generation
//
//		double rand = Math.random(); // between 0.0 and 1.0
//		int randomInt = (int)(Math.random() * 100); // 0 to 99
        
        System.out.println("Random 0-1: " + Math.random());
        System.out.println("Random 0-99: " + (int)(Math.random() * 100));



	}
}
