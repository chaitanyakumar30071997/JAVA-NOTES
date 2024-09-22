package com.Method_Overriding;

public class ClassTwo extends ClassOne {
	
	 public void AadharCard(int nu) {
     	System.out.println("place Update your aadhar number  ");
     }
	
	public static void main(String[] args) {
		
		ClassTwo obj = new ClassTwo();
		
		 obj.AadharCard(9847985);
		 
		
	}


}
