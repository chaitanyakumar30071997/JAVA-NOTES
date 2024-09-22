package com.Method_Overloading;

public class TestOne {

	public void search (int price ) {
		System.out.println("Price is only in digits ");
		
	}
	public void search (String brand ) {
		System.out.println("This onli band  ");	
		
	}
	
	public static void main(String[] args) {
		TestOne obj = new TestOne();
		obj.search(50);
		obj.search("puma");
	}

	/*
	 * Method Overloading Method overloading allows us to define multiple methods
	 * with the same name in a class, but with different parameter lists. There are
	 * two primary ways to achieve method overloading:
	 * 
	 * Different Numbers of Arguments: You can implement two or more methods with
	 * the same name but different numbers of arguments.
	 * 
	 */
	
}
