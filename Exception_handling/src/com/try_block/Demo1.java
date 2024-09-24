package com.try_block;

public class Demo1 {
	
	int result = 5;

	
	    public static void main(String[] args) {
	        try {
	            // Code that may throw an exception
	            int result = 5 / 0; // This will cause ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            // Handling the exception
	            System.out.println("ArithmeticException => " + e.getMessage());
	        } finally {
	            // This block executes regardless of exception occurrence
	            System.out.println("This is the finally block.");
	        }
	    }
	}

