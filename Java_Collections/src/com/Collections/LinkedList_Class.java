package com.Collections;

import java.util.LinkedList;

public class LinkedList_Class {
	
	public static void main(String[] args) {
		
		 LinkedList<String> li = new LinkedList<String>();
		 
		 li.add("Wellcome");
		 li.add("to");
		 li.add("india");
		 
		 System.out.println(li);
		 System.out.println(li.addAll(3, li));
		 System.out.println(li.getFirst());
		 System.out.println(li.isEmpty());
		 System.out.println(li.contains(li));
		
		}

}
