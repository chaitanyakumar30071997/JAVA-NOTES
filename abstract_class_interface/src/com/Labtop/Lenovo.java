package com.Labtop;

public abstract class Lenovo implements  Labtop {
	
	/* If your implements interface class  in lenovo class  You must implement all method , so 
	 * I don't want to implements all method ,I want to implements  only copy (),  cut() by 
	 * use abstract keyword. before class */
	
	
	/* Must user abstract keyword before class  implements copy (), cut () method only  */
	
    public void copy() {
    	
    	System.out.println("This class is copy implements Lenovo ");
    	
    }
	
	public void cut () {
		System.out.println("This cut method implements Lenovo ");
		
		
	}
	
	

}
