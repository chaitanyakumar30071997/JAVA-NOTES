package com.Collections_Set;


import java.util.TreeSet;
public class Treeset_class {
	
	  public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Apply");
		ts.add("App");
		ts.add("aaa");
		ts.add("AAA");
		ts.add("Ball");
		ts.add("Cat");
		ts.add("Cat");
		ts.add("0Apply");
		ts.add("2Ball");
		ts.add("3Cat");
		ts.add("3Cat");	
		ts.add("#");
		
		System.out.println(ts);
	    System.out.println(ts.hashCode());
	    System.out.println(ts.size());
	    System.out.println(ts.isEmpty());
	    System.out.println(ts.remove("#"));
	    System.out.println(ts);
		
	}

}

/* Treeset:- treeset Remove Duplicate values , it  follows the index order and its sorted values (A to Z) (1 to 1
 * 
 * OutPut:- 
[#, 0Apply, 2Ball, 3Cat, AAA, App, Apply, Ball, Cat, aaa]
1553335483
10
false
true
[0Apply, 2Ball, 3Cat, AAA, App, Apply, Ball, Cat, aaa]
 * */ 
