package com.prashu.basics;


// Topic: Boolean & Assignment Operators in Java
/*
 * Boolean Operators: Work with true/false logic.
 * Assignment Operators: Assign and update variable values efficiently.
*/
public class BooleanAndAssignmentOperators {
    public static void main(String[] args) {
        // Boolean operators
        boolean isAdult = true;
        boolean hasLicense = false;

        if (isAdult && hasLicense) {
            System.out.println("Can drive");
        } else {
            System.out.println("Cannot drive");
        }

        // Assignment operators
        int a = 10;
        a += 5; // a = a + 5
        System.out.println("a += 5: " + a);

        a *= 2; // a = a * 2
        System.out.println("a *= 2: " + a);
    }
}

