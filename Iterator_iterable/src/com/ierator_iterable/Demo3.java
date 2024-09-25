package com.ierator_iterable;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo3 {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> obj = new ArrayList();
	 obj.add("Welcome");
	 obj.add("come");
	 obj.add("to");
	 obj.add("India ");
	 
	 System.out.println(obj);


	 ListIterator<String> obj1 = obj.listIterator() ;
	
	 while (obj1.hasNext()) {
		 System.out.println(obj1.next().toUpperCase());
		 
	 }while(obj1.hasPrevious()) {
		 System.out.println(obj1.previous());
		 
	 }
	   
	}
	
	
}

/***
 --> Iterator is interface which is helps to iterator elements which present in the java collection.(Set,List,Map)
 
 --> ListIterator is a interface which is helps to extract only List related operations (ArrtaList , LinkedList, vector)
 
 --> hasPrevious:- only in the make forward and backward direction .
  
 --> From last element previous element present or not last index 
 
 
  
 *  outPut:- 
 * [Welcome, come, to, India ]
WELLCOME
COME
TO
INDIA 
India 
to
come
Wellcome

 * */ 
