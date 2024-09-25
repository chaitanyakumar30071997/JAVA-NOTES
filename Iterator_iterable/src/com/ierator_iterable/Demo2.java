package com.ierator_iterable;

import java.util.ArrayList;

public class Demo2 {
	
public static void main(String[] args) {
		
   		ArrayList<String> obj = new ArrayList();
		 obj.add("Wellcome");
		 obj.add("come");
		 obj.add("to");
		 obj.add("India ");
		 
		 System.out.println(obj);
		 
		  for (String a : obj) {
			  System.out.println(a);
			
		}

    }
}

/* outPut:- 
[Wellcome, come, to, India ]
Wellcome
come
to
India 


 
 * */
