package com.prashu.basics;

//Types of Loops
/*
 * Loop 		Type	Best Use Case
for		When the number of iterations is known
while		When the condition is checked before looping
do-while	When the loop must run at least once*/

public class Loops {
	
	public static void main(String[] args)
	{
//		for (initialization; condition; update) {
//		    // body
//		}		
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Hello " + i);
		}
		
		
		int i = 1;
		while (i <= 5) {
		    System.out.println("Hi " + i);
		    i++;
		}
		
		int a = 1;
		do {
		    System.out.println("Welcome " + a);
		    a++;
		} while (a <= 5);
	}

}
