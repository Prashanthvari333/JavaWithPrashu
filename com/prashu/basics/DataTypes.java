package com.prashu.basics;

/*
 * Java is a statically-typed language — every variable must have a type.

	Two main categories of data types:

	Primitive (8 types)

	Non-primitive / Reference
*/
public class DataTypes {
	
	public static void main(String[] args) {
		
//		Primitive Data Types (8 types)
		byte b = 100;
	    short s = 10000;
	    int i = 123456;
	    long l = 123456789L;
	    float f = 3.14f;
	    double d = 3.14159;
	    char c = 'A';
	    boolean isJavaFun = true;

	    System.out.println("Byte: " + b);
	    System.out.println("Short: " + s);
	    System.out.println("Int: " + i);
	    System.out.println("Long: " + l);
	    System.out.println("Float: " + f);
	    System.out.println("Double: " + d);
	    System.out.println("Char: " + c);
	    System.out.println("Boolean: " + isJavaFun);
	    
//		2. Non-Primitive (Reference) Data Types
//		String, Arrays, Classes, Objects, Interfaces
	    String message = "Welcome to Java";
	    System.out.println("String: " + message);
	    
//		3. Type Inference with var (Java 10+)
		var a = 3;// → automatically infers int
	    System.out.println("value of a :"+ a);
	}


}
