package com.Collections_Set;

import java.util.HashSet;


class Hashset_class {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Apply");
		hs.add("Ball");
		hs.add("Cat");
		hs.add("Cat");
		hs.add("1Apply");
		hs.add("2Ball");
		hs.add("3Cat");
		hs.add("3Cat");	
		hs.add("#");
		
		System.out.println(hs);
	    System.out.println(hs.hashCode());
	    System.out.println(hs.size());
	    System.out.println(hs.isEmpty());
	    System.out.println(hs.remove("#"));
	    System.out.println(hs);
	    
	}	
}

// HashSet :-Remove duplicate  values , it will not follow the order

/*
 * OutPut:-
 *  [Ball, 2Ball, #, Apply, Cat, 1Apply, 3Cat] 
 *  1581737719 
 *  false 
 *  7 
 *  false
 *  true 
 * [Ball, 2Ball, Apply, Cat, 1Apply, 3Cat]
 */


	

