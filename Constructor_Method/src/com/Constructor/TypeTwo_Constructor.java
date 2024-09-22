package com.Constructor;

public class TypeTwo_Constructor {
	
	TypeTwo_Constructor(){
		System.out.println("call Constructor without create obj ");
	}
	
	TypeTwo_Constructor(String location){
		System.out.println(" create two Constructor create this is Constructor arguments pass  ");
	}
	
	public static void main(String[] args) {
		
		// call String location
		TypeTwo_Constructor obj = new TypeTwo_Constructor("usa");
		
		// TypeTwo_Constructor obj = new TypeTwo_Constructor();
		
	}

}
