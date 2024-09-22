package com.Constructor;

public class Typeone {

	
	Typeone(){
		System.out.println("Load content when they call");
		
	}
	public static void main(String[] args) {
		Typeone obj = new Typeone();
		
	}
}


/*
 * 1. What Is a Constructor? 
 *-->   A constructor in Java is a special method that gets invoked when you create an object of a class.
 *  
 *-->   Unlike regular methods, constructors have the same name as the class they belong to, and they don’t
 *      have a return type.
 *  
 * -->  Constructors are responsible for setting up the initial state of an object—allocating memory,
 *      initializing variables, and performing any necessary setup
 */