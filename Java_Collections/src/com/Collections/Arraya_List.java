package com.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arraya_List {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(56);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
//		al.equals(a2);
//		al.subList(2, 4);
		al.isEmpty();
		
//		System.out.println(al.isEmpty());
		
//		System.out.println(al.equals(a2));
		
//		System.out.println(al.contains(a2));
		
//		System.out.println(al.size());
		
//		System.out.println(al.hashCode());

		ArrayList<String> sl = new ArrayList<String>();
		
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("Wellcome");
	
	     sl.add("This is Arrya List code "); 
	     sl.addFirst(" @ "); 
	     sl.addLast("#");
	     sl.addAll(0, s2);
	     
	     System.out.println(sl.equals(s2));
	     System.out.println(sl.isEmpty());
	     System.out.println(sl.hashCode());
	     
	    
	}

}
