package com.Encapsulation;

public class TestOne {
	
	    public static void main(String[] args) {
	    	
	        Emp obj = new Emp();
	        obj.setId(1);
	        obj.setName("Shiva"); 
	        obj.setEmail("Shiva@example.com");
	        
	        System.out.println(obj.getId());
	        System.out.println(obj.getName());
	        System.out.println(obj.getEmail());
	    }

}
