package com.For_Each;

public class ForEach_class {
	
	public static void main(String[] args) {
		
		int [] number = {1,2,3,4,5};
		
		for(int x :  number) {
			System.out.println(x);
		}
		
		
		
		String [] arr = {"apply","ball","cat","dog"};
		
		for (String y : arr ) {
			System.out.println(y);
			
		}
		
		char [] ch = {'a','b','c','d','f','g','h'};
		
		for (char z : ch) {
			
			System.out.println(z);
		}
	}

}
