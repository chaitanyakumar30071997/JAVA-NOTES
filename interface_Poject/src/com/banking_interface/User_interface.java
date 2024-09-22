package com.banking_interface;

public class User_interface  implements  PhonePay  {
	

	/* interface class must implements in class only  */
	
	public void sbi() {
		System.out.println("This sbi bank my balnce is 2000");
		
	}

	public void HDFC() {
		System.out.println("This is HDFC bakbalnces is 50000");
		
	}
	
	public void check() {
		System.out.println("This PhonePay wallte amount is 500");
		
		
	}
	
	public static void main(String[] args) {
		User_interface obj = new User_interface();
		obj.sbi();
		obj.HDFC();
		obj.check();
		
	}

}


