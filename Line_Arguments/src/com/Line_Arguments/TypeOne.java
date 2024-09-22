package com.Line_Arguments;

public class TypeOne {
	
	public int add(int x , int y) {
	   int z = x + y ;
	   return z ;
	}
	
	public static void main(String[] args) {
		TypeOne obj = new  TypeOne();
		 int z =  obj.add(10, 20);
       
		System.out.println(z);
	}

}
