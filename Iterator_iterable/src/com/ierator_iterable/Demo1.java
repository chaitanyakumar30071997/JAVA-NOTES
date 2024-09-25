package com.ierator_iterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Demo1 {
	

	public static void main(String[] args) {
		
   		ArrayList<String> obj = new ArrayList();
		 obj.add("Wellcome");
		 obj.add("come");
		 obj.add("to");
		 obj.add("India ");
		 
		 System.out.println(obj);
		 
		 Iterator<String> obj1 = obj.iterator();
		 while (obj1.hasNext()) {
			System.out.println(obj1.next());	
		}
		 
	}

}


/* 
 -->hasNext:- predefined  method form iterator, which helps to use to check next element is present or not
 * output:-
[Wellcome, come, to, India ]
Wellcome
come
to
India 
 *  */
