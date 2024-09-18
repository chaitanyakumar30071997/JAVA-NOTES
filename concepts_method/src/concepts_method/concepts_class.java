package concepts_method;

// •	Concepts and Method 
// •	Concepts does not have the return type
// •	Where method has return type
// •	Concepts name must be class matches the class name 
// •	Method should not  have  same as class as class name
// •	Concepts will be executed when you create object for class.
// •	Method will be executed by create object and call that method with help of object  referece
// •	Status method will be executed by default .



public class concepts_class {
	
	//without call obj call method 
	
	 concepts_class(){
		 System.out.println("This is concepts Method ");
	 }
	 
	public  void hello() {
		
		System.out.println("This is method ");
		 
	 }
	  public static void main(String[] args) {
		  
		  
	      concepts_class obj = new concepts_class();
		  
		  obj.hello();
		
	}	
	

}
