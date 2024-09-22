package method_package;

public class Method_type1 {
	
	public int add () {
		int x = 10;
		int y = 20;
		int z = x + y;
		
		return z ;
	}
	
	public void mul() {
			
		int z = add();
		System.out.println(z);
		}
	
		/*
		 1.jvm --> first priority check the main method 
		 2. identify and compile
		 3. in main method static key word static content which you are writing will be executed
		 4.  What is overload ? // Ans - in class have two are more main method jvm
		 check which method executed 
		 access-modifier return type method name
		 */
	
	public static void main(String[] args) {
		
		Method_type1 obj = new Method_type1();
		obj.mul();
		
		
		
	}
	
	/*
	 * What is overload ? Ans - in class have two are more main method jvm check
	 * which method executed
	 */
	public static void main( ) {
		
	}
		
	}


	/*
	 * set of statements 
	 * return type --> reserved word in java
	 * if one method trying to access the values from another method 
	 * void --> has to be replace 
	 * You to identify what values are you returning ("z")
	 * You have to identify what type of "Z" (int)
	 * add remove statement and add the value that you wanted to return 
	 * 
	 */ 
	


