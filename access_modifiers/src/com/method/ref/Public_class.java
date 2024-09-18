package com.method.ref;

public class Public_class {
	

	public void add() {
		System.out.println("add public");
	}
	
	
	private void sub() {
		System.out.println("sub private ");
	}
	
	
	 protected void  div() {
		System.out.println("div protected  Class ");
	}
	 
	 
	  void  equ() {
			System.out.println("equ default class ");
	}
	  
	  public static void main(String[] args) {
		  
		// Accessible only within the same class.
		  Public_class obj2 = new Public_class();
		  obj2.sub();
		  obj2.div();
		  obj2.equ();
		  obj2.add();
	}
	
	

}



