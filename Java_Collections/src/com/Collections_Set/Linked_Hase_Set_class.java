package com.Collections_Set;


import java.util.LinkedHashSet;

public class Linked_Hase_Set_class {
	
	public static void main(String[] args) {
		LinkedHashSet<String>  lhs  = new LinkedHashSet<String>();
		
		lhs.add("Apply");
		lhs.add("Ball");
		lhs.add("Cat");
		lhs.add("Cat");
		lhs.add("1Apply");
		lhs.add("2Ball");
		lhs.add("3Cat");
		lhs.add("3Cat");	
		lhs.add("#");
		
		System.out.println(lhs);
	    System.out.println(lhs.hashCode());
	    System.out.println(lhs.size());
	    System.out.println(lhs.isEmpty());
	    System.out.println(lhs.remove("#"));
	    System.out.println(lhs);
	    
	
	}

}

// LinkedHashSet Remove Duplicate values , it  follows the order 

/* OutPut:- 
[Apply, Ball, Cat, 1Apply, 2Ball, 3Cat, #]
1581737719
7
false
true
[Apply, Ball, Cat, 1Apply, 2Ball, 3Cat]
 
 * */ 
